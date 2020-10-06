// ANTLR GENERATED CODE: DO NOT EDIT
package org.apache.lucene.queryparser.classic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClassicQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface ClassicQueryParserVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#top}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTop(ClassicQueryParser.TopContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#query}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitQuery(ClassicQueryParser.QueryContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#first_clause}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFirst_clause(ClassicQueryParser.First_clauseContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#conjunction_clause}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitConjunction_clause(ClassicQueryParser.Conjunction_clauseContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#multi_term}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMulti_term(ClassicQueryParser.Multi_termContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#clause}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitClause(ClassicQueryParser.ClauseContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#clause_field}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitClause_field(ClassicQueryParser.Clause_fieldContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#clause_term}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitClause_term(ClassicQueryParser.Clause_termContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#term}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTerm(ClassicQueryParser.TermContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#simple_term}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSimple_term(ClassicQueryParser.Simple_termContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#quoted_term}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitQuoted_term(ClassicQueryParser.Quoted_termContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#range_term}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRange_term(ClassicQueryParser.Range_termContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#range_first}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRange_first(ClassicQueryParser.Range_firstContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#range_second}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRange_second(ClassicQueryParser.Range_secondContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#range_start}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRange_start(ClassicQueryParser.Range_startContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#range_part}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRange_part(ClassicQueryParser.Range_partContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#range_end}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRange_end(ClassicQueryParser.Range_endContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#boost_or_fuzzy_boost}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBoost_or_fuzzy_boost(ClassicQueryParser.Boost_or_fuzzy_boostContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#boost}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBoost(ClassicQueryParser.BoostContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#modifiers}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitModifiers(ClassicQueryParser.ModifiersContext ctx);
  /**
   * Visit a parse tree produced by {@link ClassicQueryParser#conjunction}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitConjunction(ClassicQueryParser.ConjunctionContext ctx);
}
