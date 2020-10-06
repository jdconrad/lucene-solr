// ANTLR GENERATED CODE: DO NOT EDIT
package org.apache.lucene.queryparser.classic;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
class ClassicQueryParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    WHITESPACE=1, AND=2, OR=3, NOT=4, PLUS=5, MINUS=6, BAREOPER=7, LPAREN=8, 
    RPAREN=9, COLON=10, STAR=11, CARAT=12, QUOTED=13, NUMBER=14, TERM=15, 
    FUZZY_SLOP=16, PREFIXTERM=17, WILDTERM=18, REGEXPTERM=19, RANGE_IN_START=20, 
    RANGE_EX_START=21, BOOST_NUMBER=22, RANGE_TO=23, RANGE_IN_END=24, RANGE_EX_END=25, 
    RANGE_QUOTED=26, RANGE_GOOP=27;
  public static final int
    RULE_top = 0, RULE_query = 1, RULE_first_clause = 2, RULE_conjunction_clause = 3, 
    RULE_multi_term = 4, RULE_clause = 5, RULE_clause_field = 6, RULE_clause_term = 7, 
    RULE_term = 8, RULE_simple_term = 9, RULE_quoted_term = 10, RULE_range_term = 11, 
    RULE_range_first = 12, RULE_range_second = 13, RULE_range_start = 14, 
    RULE_range_part = 15, RULE_range_end = 16, RULE_boost_or_fuzzy_boost = 17, 
    RULE_boost = 18, RULE_modifiers = 19, RULE_conjunction = 20;
  public static final String[] ruleNames = {
    "top", "query", "first_clause", "conjunction_clause", "multi_term", "clause", 
    "clause_field", "clause_term", "term", "simple_term", "quoted_term", "range_term", 
    "range_first", "range_second", "range_start", "range_part", "range_end", 
    "boost_or_fuzzy_boost", "boost", "modifiers", "conjunction"
  };

  private static final String[] _LITERAL_NAMES = {
    null, null, null, null, null, "'+'", "'-'", null, "'('", "')'", "':'", 
    "'*'", "'^'", null, null, null, null, null, null, null, "'['", "'{'", 
    null, "'TO'", "']'", "'}'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, "WHITESPACE", "AND", "OR", "NOT", "PLUS", "MINUS", "BAREOPER", "LPAREN", 
    "RPAREN", "COLON", "STAR", "CARAT", "QUOTED", "NUMBER", "TERM", "FUZZY_SLOP", 
    "PREFIXTERM", "WILDTERM", "REGEXPTERM", "RANGE_IN_START", "RANGE_EX_START", 
    "BOOST_NUMBER", "RANGE_TO", "RANGE_IN_END", "RANGE_EX_END", "RANGE_QUOTED", 
    "RANGE_GOOP"
  };
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() { return "ClassicQueryParser.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }

  public ClassicQueryParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class TopContext extends ParserRuleContext {
    public QueryContext query() {
      return getRuleContext(QueryContext.class,0);
    }
    public TerminalNode EOF() { return getToken(ClassicQueryParser.EOF, 0); }
    public TopContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_top; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitTop(this);
      else return visitor.visitChildren(this);
    }
  }

  public final TopContext top() throws RecognitionException {
    TopContext _localctx = new TopContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_top);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(42);
      query();
      setState(43);
      match(EOF);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class QueryContext extends ParserRuleContext {
    public First_clauseContext first_clause() {
      return getRuleContext(First_clauseContext.class,0);
    }
    public List<Conjunction_clauseContext> conjunction_clause() {
      return getRuleContexts(Conjunction_clauseContext.class);
    }
    public Conjunction_clauseContext conjunction_clause(int i) {
      return getRuleContext(Conjunction_clauseContext.class,i);
    }
    public QueryContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_query; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitQuery(this);
      else return visitor.visitChildren(this);
    }
  }

  public final QueryContext query() throws RecognitionException {
    QueryContext _localctx = new QueryContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_query);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(45);
      first_clause();
      setState(49);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << TERM))) != 0)) {
        {
        {
        setState(46);
        conjunction_clause();
        }
        }
        setState(51);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class First_clauseContext extends ParserRuleContext {
    public Multi_termContext multi_term() {
      return getRuleContext(Multi_termContext.class,0);
    }
    public ModifiersContext modifiers() {
      return getRuleContext(ModifiersContext.class,0);
    }
    public ClauseContext clause() {
      return getRuleContext(ClauseContext.class,0);
    }
    public First_clauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_first_clause; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitFirst_clause(this);
      else return visitor.visitChildren(this);
    }
  }

  public final First_clauseContext first_clause() throws RecognitionException {
    First_clauseContext _localctx = new First_clauseContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_first_clause);
    try {
      setState(56);
      switch (_input.LA(1)) {
      case TERM:
        enterOuterAlt(_localctx, 1);
        {
        setState(52);
        multi_term();
        }
        break;
      case NOT:
      case PLUS:
      case MINUS:
        enterOuterAlt(_localctx, 2);
        {
        setState(53);
        modifiers();
        setState(54);
        clause();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Conjunction_clauseContext extends ParserRuleContext {
    public Multi_termContext multi_term() {
      return getRuleContext(Multi_termContext.class,0);
    }
    public ConjunctionContext conjunction() {
      return getRuleContext(ConjunctionContext.class,0);
    }
    public ModifiersContext modifiers() {
      return getRuleContext(ModifiersContext.class,0);
    }
    public ClauseContext clause() {
      return getRuleContext(ClauseContext.class,0);
    }
    public Conjunction_clauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_conjunction_clause; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitConjunction_clause(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Conjunction_clauseContext conjunction_clause() throws RecognitionException {
    Conjunction_clauseContext _localctx = new Conjunction_clauseContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_conjunction_clause);
    try {
      setState(63);
      switch (_input.LA(1)) {
      case TERM:
        enterOuterAlt(_localctx, 1);
        {
        setState(58);
        multi_term();
        }
        break;
      case AND:
      case OR:
        enterOuterAlt(_localctx, 2);
        {
        setState(59);
        conjunction();
        setState(60);
        modifiers();
        setState(61);
        clause();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Multi_termContext extends ParserRuleContext {
    public List<TerminalNode> TERM() { return getTokens(ClassicQueryParser.TERM); }
    public TerminalNode TERM(int i) {
      return getToken(ClassicQueryParser.TERM, i);
    }
    public Multi_termContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_multi_term; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitMulti_term(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Multi_termContext multi_term() throws RecognitionException {
    Multi_termContext _localctx = new Multi_termContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_multi_term);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(66); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(65);
          match(TERM);
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(68); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ClauseContext extends ParserRuleContext {
    public Clause_termContext clause_term() {
      return getRuleContext(Clause_termContext.class,0);
    }
    public Clause_fieldContext clause_field() {
      return getRuleContext(Clause_fieldContext.class,0);
    }
    public ClauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_clause; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitClause(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ClauseContext clause() throws RecognitionException {
    ClauseContext _localctx = new ClauseContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_clause);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(71);
      _errHandler.sync(this);
      switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
      case 1:
        {
        setState(70);
        clause_field();
        }
        break;
      }
      setState(73);
      clause_term();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Clause_fieldContext extends ParserRuleContext {
    public TerminalNode TERM() { return getToken(ClassicQueryParser.TERM, 0); }
    public TerminalNode COLON() { return getToken(ClassicQueryParser.COLON, 0); }
    public TerminalNode STAR() { return getToken(ClassicQueryParser.STAR, 0); }
    public Clause_fieldContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_clause_field; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitClause_field(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Clause_fieldContext clause_field() throws RecognitionException {
    Clause_fieldContext _localctx = new Clause_fieldContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_clause_field);
    try {
      setState(79);
      switch (_input.LA(1)) {
      case TERM:
        enterOuterAlt(_localctx, 1);
        {
        setState(75);
        match(TERM);
        setState(76);
        match(COLON);
        }
        break;
      case STAR:
        enterOuterAlt(_localctx, 2);
        {
        setState(77);
        match(STAR);
        setState(78);
        match(COLON);
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Clause_termContext extends ParserRuleContext {
    public TermContext term() {
      return getRuleContext(TermContext.class,0);
    }
    public TerminalNode LPAREN() { return getToken(ClassicQueryParser.LPAREN, 0); }
    public QueryContext query() {
      return getRuleContext(QueryContext.class,0);
    }
    public TerminalNode RPAREN() { return getToken(ClassicQueryParser.RPAREN, 0); }
    public BoostContext boost() {
      return getRuleContext(BoostContext.class,0);
    }
    public Clause_termContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_clause_term; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitClause_term(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Clause_termContext clause_term() throws RecognitionException {
    Clause_termContext _localctx = new Clause_termContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_clause_term);
    int _la;
    try {
      setState(88);
      switch (_input.LA(1)) {
      case BAREOPER:
      case STAR:
      case QUOTED:
      case NUMBER:
      case TERM:
      case PREFIXTERM:
      case WILDTERM:
      case REGEXPTERM:
      case RANGE_IN_START:
      case RANGE_EX_START:
        enterOuterAlt(_localctx, 1);
        {
        setState(81);
        term();
        }
        break;
      case LPAREN:
        enterOuterAlt(_localctx, 2);
        {
        setState(82);
        match(LPAREN);
        setState(83);
        query();
        setState(84);
        match(RPAREN);
        setState(86);
        _la = _input.LA(1);
        if (_la==CARAT) {
          {
          setState(85);
          boost();
          }
        }

        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TermContext extends ParserRuleContext {
    public Simple_termContext simple_term() {
      return getRuleContext(Simple_termContext.class,0);
    }
    public Quoted_termContext quoted_term() {
      return getRuleContext(Quoted_termContext.class,0);
    }
    public Range_termContext range_term() {
      return getRuleContext(Range_termContext.class,0);
    }
    public TermContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_term; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitTerm(this);
      else return visitor.visitChildren(this);
    }
  }

  public final TermContext term() throws RecognitionException {
    TermContext _localctx = new TermContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_term);
    try {
      setState(93);
      switch (_input.LA(1)) {
      case BAREOPER:
      case STAR:
      case NUMBER:
      case TERM:
      case PREFIXTERM:
      case WILDTERM:
      case REGEXPTERM:
        enterOuterAlt(_localctx, 1);
        {
        setState(90);
        simple_term();
        }
        break;
      case QUOTED:
        enterOuterAlt(_localctx, 2);
        {
        setState(91);
        quoted_term();
        }
        break;
      case RANGE_IN_START:
      case RANGE_EX_START:
        enterOuterAlt(_localctx, 3);
        {
        setState(92);
        range_term();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Simple_termContext extends ParserRuleContext {
    public TerminalNode TERM() { return getToken(ClassicQueryParser.TERM, 0); }
    public TerminalNode STAR() { return getToken(ClassicQueryParser.STAR, 0); }
    public TerminalNode PREFIXTERM() { return getToken(ClassicQueryParser.PREFIXTERM, 0); }
    public TerminalNode WILDTERM() { return getToken(ClassicQueryParser.WILDTERM, 0); }
    public TerminalNode REGEXPTERM() { return getToken(ClassicQueryParser.REGEXPTERM, 0); }
    public TerminalNode NUMBER() { return getToken(ClassicQueryParser.NUMBER, 0); }
    public TerminalNode BAREOPER() { return getToken(ClassicQueryParser.BAREOPER, 0); }
    public Boost_or_fuzzy_boostContext boost_or_fuzzy_boost() {
      return getRuleContext(Boost_or_fuzzy_boostContext.class,0);
    }
    public Simple_termContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_simple_term; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitSimple_term(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Simple_termContext simple_term() throws RecognitionException {
    Simple_termContext _localctx = new Simple_termContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_simple_term);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(95);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAREOPER) | (1L << STAR) | (1L << NUMBER) | (1L << TERM) | (1L << PREFIXTERM) | (1L << WILDTERM) | (1L << REGEXPTERM))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(97);
      _la = _input.LA(1);
      if (_la==CARAT || _la==FUZZY_SLOP) {
        {
        setState(96);
        boost_or_fuzzy_boost();
        }
      }

      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Quoted_termContext extends ParserRuleContext {
    public TerminalNode QUOTED() { return getToken(ClassicQueryParser.QUOTED, 0); }
    public Boost_or_fuzzy_boostContext boost_or_fuzzy_boost() {
      return getRuleContext(Boost_or_fuzzy_boostContext.class,0);
    }
    public Quoted_termContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_quoted_term; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitQuoted_term(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Quoted_termContext quoted_term() throws RecognitionException {
    Quoted_termContext _localctx = new Quoted_termContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_quoted_term);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(99);
      match(QUOTED);
      setState(101);
      _la = _input.LA(1);
      if (_la==CARAT || _la==FUZZY_SLOP) {
        {
        setState(100);
        boost_or_fuzzy_boost();
        }
      }

      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Range_termContext extends ParserRuleContext {
    public Range_startContext range_start() {
      return getRuleContext(Range_startContext.class,0);
    }
    public Range_firstContext range_first() {
      return getRuleContext(Range_firstContext.class,0);
    }
    public TerminalNode RANGE_TO() { return getToken(ClassicQueryParser.RANGE_TO, 0); }
    public Range_secondContext range_second() {
      return getRuleContext(Range_secondContext.class,0);
    }
    public Range_endContext range_end() {
      return getRuleContext(Range_endContext.class,0);
    }
    public BoostContext boost() {
      return getRuleContext(BoostContext.class,0);
    }
    public Range_termContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_range_term; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitRange_term(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Range_termContext range_term() throws RecognitionException {
    Range_termContext _localctx = new Range_termContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_range_term);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(103);
      range_start();
      setState(104);
      range_first();
      setState(105);
      match(RANGE_TO);
      setState(106);
      range_second();
      setState(107);
      range_end();
      setState(109);
      _la = _input.LA(1);
      if (_la==CARAT) {
        {
        setState(108);
        boost();
        }
      }

      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Range_firstContext extends ParserRuleContext {
    public Range_partContext range_part() {
      return getRuleContext(Range_partContext.class,0);
    }
    public Range_firstContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_range_first; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitRange_first(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Range_firstContext range_first() throws RecognitionException {
    Range_firstContext _localctx = new Range_firstContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_range_first);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(111);
      range_part();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Range_secondContext extends ParserRuleContext {
    public Range_partContext range_part() {
      return getRuleContext(Range_partContext.class,0);
    }
    public Range_secondContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_range_second; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitRange_second(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Range_secondContext range_second() throws RecognitionException {
    Range_secondContext _localctx = new Range_secondContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_range_second);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(113);
      range_part();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Range_startContext extends ParserRuleContext {
    public TerminalNode RANGE_IN_START() { return getToken(ClassicQueryParser.RANGE_IN_START, 0); }
    public TerminalNode RANGE_EX_START() { return getToken(ClassicQueryParser.RANGE_EX_START, 0); }
    public Range_startContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_range_start; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitRange_start(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Range_startContext range_start() throws RecognitionException {
    Range_startContext _localctx = new Range_startContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_range_start);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(115);
      _la = _input.LA(1);
      if ( !(_la==RANGE_IN_START || _la==RANGE_EX_START) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Range_partContext extends ParserRuleContext {
    public TerminalNode RANGE_GOOP() { return getToken(ClassicQueryParser.RANGE_GOOP, 0); }
    public TerminalNode RANGE_QUOTED() { return getToken(ClassicQueryParser.RANGE_QUOTED, 0); }
    public TerminalNode RANGE_TO() { return getToken(ClassicQueryParser.RANGE_TO, 0); }
    public Range_partContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_range_part; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitRange_part(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Range_partContext range_part() throws RecognitionException {
    Range_partContext _localctx = new Range_partContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_range_part);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(117);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RANGE_TO) | (1L << RANGE_QUOTED) | (1L << RANGE_GOOP))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Range_endContext extends ParserRuleContext {
    public TerminalNode RANGE_IN_END() { return getToken(ClassicQueryParser.RANGE_IN_END, 0); }
    public TerminalNode RANGE_EX_END() { return getToken(ClassicQueryParser.RANGE_EX_END, 0); }
    public Range_endContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_range_end; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitRange_end(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Range_endContext range_end() throws RecognitionException {
    Range_endContext _localctx = new Range_endContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_range_end);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(119);
      _la = _input.LA(1);
      if ( !(_la==RANGE_IN_END || _la==RANGE_EX_END) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Boost_or_fuzzy_boostContext extends ParserRuleContext {
    public BoostContext boost() {
      return getRuleContext(BoostContext.class,0);
    }
    public TerminalNode FUZZY_SLOP() { return getToken(ClassicQueryParser.FUZZY_SLOP, 0); }
    public Boost_or_fuzzy_boostContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_boost_or_fuzzy_boost; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitBoost_or_fuzzy_boost(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Boost_or_fuzzy_boostContext boost_or_fuzzy_boost() throws RecognitionException {
    Boost_or_fuzzy_boostContext _localctx = new Boost_or_fuzzy_boostContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_boost_or_fuzzy_boost);
    int _la;
    try {
      setState(126);
      switch (_input.LA(1)) {
      case CARAT:
        enterOuterAlt(_localctx, 1);
        {
        setState(121);
        boost();
        }
        break;
      case FUZZY_SLOP:
        enterOuterAlt(_localctx, 2);
        {
        setState(122);
        match(FUZZY_SLOP);
        setState(124);
        _la = _input.LA(1);
        if (_la==CARAT) {
          {
          setState(123);
          boost();
          }
        }

        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BoostContext extends ParserRuleContext {
    public TerminalNode CARAT() { return getToken(ClassicQueryParser.CARAT, 0); }
    public TerminalNode BOOST_NUMBER() { return getToken(ClassicQueryParser.BOOST_NUMBER, 0); }
    public BoostContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_boost; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitBoost(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BoostContext boost() throws RecognitionException {
    BoostContext _localctx = new BoostContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_boost);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(128);
      match(CARAT);
      setState(129);
      match(BOOST_NUMBER);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ModifiersContext extends ParserRuleContext {
    public TerminalNode PLUS() { return getToken(ClassicQueryParser.PLUS, 0); }
    public TerminalNode MINUS() { return getToken(ClassicQueryParser.MINUS, 0); }
    public TerminalNode NOT() { return getToken(ClassicQueryParser.NOT, 0); }
    public ModifiersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_modifiers; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitModifiers(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ModifiersContext modifiers() throws RecognitionException {
    ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_modifiers);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(131);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ConjunctionContext extends ParserRuleContext {
    public TerminalNode AND() { return getToken(ClassicQueryParser.AND, 0); }
    public TerminalNode OR() { return getToken(ClassicQueryParser.OR, 0); }
    public ConjunctionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_conjunction; }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof ClassicQueryParserVisitor ) return ((ClassicQueryParserVisitor<? extends T>)visitor).visitConjunction(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ConjunctionContext conjunction() throws RecognitionException {
    ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_conjunction);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(133);
      _la = _input.LA(1);
      if ( !(_la==AND || _la==OR) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u008a\4\2\t\2"+
    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\7\3\62\n"+
    "\3\f\3\16\3\65\13\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\5\5B"+
    "\n\5\3\6\6\6E\n\6\r\6\16\6F\3\7\5\7J\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bR"+
    "\n\b\3\t\3\t\3\t\3\t\3\t\5\tY\n\t\5\t[\n\t\3\n\3\n\3\n\5\n`\n\n\3\13\3"+
    "\13\5\13d\n\13\3\f\3\f\5\fh\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rp\n\r\3\16"+
    "\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\177"+
    "\n\23\5\23\u0081\n\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2"+
    "\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\b\6\2\t\t\r\r\20\21\23"+
    "\25\3\2\26\27\4\2\31\31\34\35\3\2\32\33\3\2\6\b\3\2\4\5\u0083\2,\3\2\2"+
    "\2\4/\3\2\2\2\6:\3\2\2\2\bA\3\2\2\2\nD\3\2\2\2\fI\3\2\2\2\16Q\3\2\2\2"+
    "\20Z\3\2\2\2\22_\3\2\2\2\24a\3\2\2\2\26e\3\2\2\2\30i\3\2\2\2\32q\3\2\2"+
    "\2\34s\3\2\2\2\36u\3\2\2\2 w\3\2\2\2\"y\3\2\2\2$\u0080\3\2\2\2&\u0082"+
    "\3\2\2\2(\u0085\3\2\2\2*\u0087\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\3\3\2\2\2"+
    "/\63\5\6\4\2\60\62\5\b\5\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
    "\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\66;\5\n\6\2\678\5(\25\289\5\f\7"+
    "\29;\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2;\7\3\2\2\2<B\5\n\6\2=>\5*\26\2>?"+
    "\5(\25\2?@\5\f\7\2@B\3\2\2\2A<\3\2\2\2A=\3\2\2\2B\t\3\2\2\2CE\7\21\2\2"+
    "DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HJ\5\16\b\2IH\3\2"+
    "\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\20\t\2L\r\3\2\2\2MN\7\21\2\2NR\7\f\2\2OP"+
    "\7\r\2\2PR\7\f\2\2QM\3\2\2\2QO\3\2\2\2R\17\3\2\2\2S[\5\22\n\2TU\7\n\2"+
    "\2UV\5\4\3\2VX\7\13\2\2WY\5&\24\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZS\3\2"+
    "\2\2ZT\3\2\2\2[\21\3\2\2\2\\`\5\24\13\2]`\5\26\f\2^`\5\30\r\2_\\\3\2\2"+
    "\2_]\3\2\2\2_^\3\2\2\2`\23\3\2\2\2ac\t\2\2\2bd\5$\23\2cb\3\2\2\2cd\3\2"+
    "\2\2d\25\3\2\2\2eg\7\17\2\2fh\5$\23\2gf\3\2\2\2gh\3\2\2\2h\27\3\2\2\2"+
    "ij\5\36\20\2jk\5\32\16\2kl\7\31\2\2lm\5\34\17\2mo\5\"\22\2np\5&\24\2o"+
    "n\3\2\2\2op\3\2\2\2p\31\3\2\2\2qr\5 \21\2r\33\3\2\2\2st\5 \21\2t\35\3"+
    "\2\2\2uv\t\3\2\2v\37\3\2\2\2wx\t\4\2\2x!\3\2\2\2yz\t\5\2\2z#\3\2\2\2{"+
    "\u0081\5&\24\2|~\7\22\2\2}\177\5&\24\2~}\3\2\2\2~\177\3\2\2\2\177\u0081"+
    "\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081%\3\2\2\2\u0082\u0083\7\16"+
    "\2\2\u0083\u0084\7\30\2\2\u0084\'\3\2\2\2\u0085\u0086\t\6\2\2\u0086)\3"+
    "\2\2\2\u0087\u0088\t\7\2\2\u0088+\3\2\2\2\20\63:AFIQXZ_cgo~\u0080";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
