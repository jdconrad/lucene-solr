/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.lucene.queryparser.classic;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.lucene.queryparser.charstream.CharStream;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.Query;

public class QueryBuilder extends QueryParserBase {

  @Override
  public void ReInit(CharStream stream) {

  }

  @Override
  public Query TopLevelQuery(String field) throws ParseException {
    return null;
  }
/*
// This makes sure that there is no garbage after the query string
Query TopLevelQuery(String field) : {
  Query q;
}
{
  q=Query(field) <EOF>
  { return q; }
}

Query Query(String field) :
{
  List<BooleanClause> clauses = new ArrayList<BooleanClause>();
  Query q, firstQuery=null;
  int conj, mods;
}
{
  (
    LOOKAHEAD(2)
    firstQuery=MultiTerm(field, clauses)
    | mods=Modifiers() q=Clause(field)
      {
        addClause(clauses, CONJ_NONE, mods, q);
        if (mods == MOD_NONE) {
          firstQuery = q;
        }
      }
  )
  (
    LOOKAHEAD(2)
    MultiTerm(field, clauses)
    | conj=Conjunction() mods=Modifiers() q=Clause(field)
      { addClause(clauses, conj, mods, q); }
  )*
  {
    if (clauses.size() == 1 && firstQuery != null) {
      return firstQuery;
    } else {
      return getBooleanQuery(clauses);
    }
  }
}

Query Clause(String field) : {
  Query q;
  Token fieldToken=null, boost=null;
}
{
  [
    LOOKAHEAD(2)
    (
      fieldToken=<TERM> <COLON> {field=discardEscapeChar(fieldToken.image);}
      | <STAR> <COLON> {field="*";}
    )
  ]
  (
    q=Term(field)
    | <LPAREN> q=Query(field) <RPAREN> [ <CARAT> boost=<NUMBER> ]
  )
  { return handleBoost(q, boost); }
}

Query Term(String field) : {
  Token term, boost=null, fuzzySlop=null, goop1, goop2;
  boolean prefix = false;
  boolean wildcard = false;
  boolean fuzzy = false;
  boolean regexp = false;
  boolean startInc=false;
  boolean endInc=false;
  Query q;
}
{
  (
    (
      term=<TERM>
      | term=<STAR> { wildcard=true; }
      | term=<PREFIXTERM> { prefix=true; }
      | term=<WILDTERM> { wildcard=true; }
      | term=<REGEXPTERM> { regexp=true; }
      | term=<NUMBER>
      | term=<BAREOPER> { term.image = term.image.substring(0,1); }
    )
    [
      <CARAT> boost=<NUMBER> [ fuzzySlop=<FUZZY_SLOP> { fuzzy=true; } ]
      | fuzzySlop=<FUZZY_SLOP> { fuzzy=true; } [ <CARAT> boost=<NUMBER> ]
    ]
    { q = handleBareTokenQuery(field, term, fuzzySlop, prefix, wildcard, fuzzy, regexp); }

  | ( <RANGEIN_START> { startInc = true; } | <RANGEEX_START> )
    ( goop1=<RANGE_GOOP> | goop1=<RANGE_QUOTED> | goop1=<RANGE_TO> )
    ( <RANGE_TO> )
    ( goop2=<RANGE_GOOP> | goop2=<RANGE_QUOTED> | goop2=<RANGE_TO> )
    ( <RANGEIN_END> { endInc = true; } | <RANGEEX_END> )
    [ <CARAT> boost=<NUMBER> ]
    {
      boolean startOpen=false;
      boolean endOpen=false;
      if (goop1.kind == RANGE_QUOTED) {
        goop1.image = goop1.image.substring(1, goop1.image.length()-1);
      } else if ("*".equals(goop1.image)) {
        startOpen=true;
      }
      if (goop2.kind == RANGE_QUOTED) {
        goop2.image = goop2.image.substring(1, goop2.image.length()-1);
      } else if ("*".equals(goop2.image)) {
        endOpen=true;
      }
      q = getRangeQuery(field, startOpen ? null : discardEscapeChar(goop1.image), endOpen ? null : discardEscapeChar(goop2.image), startInc, endInc);
    }

  | term=<QUOTED>
    [
      <CARAT> boost=<NUMBER> [ fuzzySlop=<FUZZY_SLOP> { fuzzy=true; } ]
      | fuzzySlop=<FUZZY_SLOP> { fuzzy=true; } [ <CARAT> boost=<NUMBER> ]
    ]
    { q = handleQuotedTerm(field, term, fuzzySlop); }
  )
  { return handleBoost(q, boost); }
}

/** Returns the first query if splitOnWhitespace=true or otherwise the entire produced query */
  /*Query MultiTerm(String field, List<BooleanClause> clauses) : {
    Token text, whitespace, followingText;
    Query firstQuery = null;
  }
  {
    text=<TERM>
      {
    if (splitOnWhitespace) {
      firstQuery = getFieldQuery(field, discardEscapeChar(text.image), false);
      addClause(clauses, CONJ_NONE, MOD_NONE, firstQuery);
    }
  }
    // Both lookaheads are required; the first lookahead vets the first following term and the second lookahead vets the rest
    LOOKAHEAD({ getToken(1).kind == TERM && allowedPostMultiTerm(getToken(2).kind) })
    (
        LOOKAHEAD({ getToken(1).kind == TERM && allowedPostMultiTerm(getToken(2).kind) })
    followingText=<TERM>
      {
    if (splitOnWhitespace) {
      Query q = getFieldQuery(field, discardEscapeChar(followingText.image), false);
      addClause(clauses, CONJ_NONE, MOD_NONE, q);
    } else { // build up the text to send to analysis
      text.image += " " + followingText.image;
    }
    }
  )+
      {
    if (splitOnWhitespace == false) {
      firstQuery = getFieldQuery(field, discardEscapeChar(text.image), false);
      addMultiTermClauses(clauses, firstQuery);
    }
    return firstQuery;
  }*/


  public Query visitTop(ClassicQueryParser.TopContext ctx) {
    return visitQuery(ctx.query());
  }


  public Query visitQuery(ClassicQueryParser.QueryContext ctx) {
    List<BooleanClause> clauses = new ArrayList<>();
    Query q, firstQuery=null;
    int conj, mods;

    if (ctx.first_clause() != null) {
      visitFirst_clause(ctx.first_clause());
    }

    for (ClassicQueryParser.Conjunction_clauseContext conjctx : ctx.conjunction_clause()) {
      visitConjunction_clause(conjctx);
    }


  }


  public Query visitFirst_clause(ClassicQueryParser.First_clauseContext ctx) {
    if (ctx.multi_term() != null) {
      return
    }

    return null;
  }


  public Object visitConjunction_clause(ClassicQueryParser.Conjunction_clauseContext ctx) {
    return null;
  }


  public Object visitMulti_term(ClassicQueryParser.Multi_termContext ctx) {
    return null;
  }

  public Object visitClause(ClassicQueryParser.ClauseContext ctx) {
    return null;
  }


  public Object visitClause_field(ClassicQueryParser.Clause_fieldContext ctx) {
    return null;
  }


  public Object visitClause_term(ClassicQueryParser.Clause_termContext ctx) {
    return null;
  }


  public Object visitTerm(ClassicQueryParser.TermContext ctx) {
    return null;
  }


  public Object visitSimple_term(ClassicQueryParser.Simple_termContext ctx) {
    return null;
  }


  public Object visitQuoted_term(ClassicQueryParser.Quoted_termContext ctx) {
    return null;
  }


  public Object visitRange_term(ClassicQueryParser.Range_termContext ctx) {
    return null;
  }


  public Object visitRange_first(ClassicQueryParser.Range_firstContext ctx) {
    return null;
  }


  public Object visitRange_second(ClassicQueryParser.Range_secondContext ctx) {
    return null;
  }


  public Object visitRange_start(ClassicQueryParser.Range_startContext ctx) {
    return null;
  }


  public Object visitRange_part(ClassicQueryParser.Range_partContext ctx) {
    return null;
  }


  public Object visitRange_end(ClassicQueryParser.Range_endContext ctx) {
    return null;
  }


  public Object visitBoost_or_fuzzy_boost(ClassicQueryParser.Boost_or_fuzzy_boostContext ctx) {
    return null;
  }


  public Object visitBoost(ClassicQueryParser.BoostContext ctx) {
    return null;
  }


  public Object visitModifiers(ClassicQueryParser.ModifiersContext ctx) {
    if (ctx == null) {
      return MOD_NONE;
    }

    if (ctx.PLUS() != null) {
      return MOD_REQ;
    }

    return MOD_NOT;
  }

  public int visitConjunction(ClassicQueryParser.ConjunctionContext ctx) {
    if (ctx == null) {
      return CONJ_NONE;
    }

    if (ctx.AND() != null) {
      return CONJ_AND;
    }

    return CONJ_OR;
  }
}
