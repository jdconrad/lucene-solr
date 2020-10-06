// ANTLR GENERATED CODE: DO NOT EDIT
package org.apache.lucene.queryparser.classic;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
abstract class ClassicQueryLexer extends Lexer {
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
  public static final int BOOST_MODE = 1;
  public static final int RANGE_MODE = 2;
  public static String[] modeNames = {
    "DEFAULT_MODE", "BOOST_MODE", "RANGE_MODE"
  };

  public static final String[] ruleNames = {
    "WHITESPACE", "NUM_CHAR", "ESCAPED_CHAR", "TERM_START_CHAR", "TERM_CHAR", 
    "QUOTED_CHAR", "AND", "OR", "NOT", "PLUS", "MINUS", "BAREOPER", "LPAREN", 
    "RPAREN", "COLON", "STAR", "CARAT", "QUOTED", "NUMBER", "TERM", "FUZZY_SLOP", 
    "PREFIXTERM", "WILDTERM", "REGEXPTERM", "RANGE_IN_START", "RANGE_EX_START", 
    "BOOST_NUMBER", "RANGE_TO", "RANGE_IN_END", "RANGE_EX_END", "RANGE_QUOTED", 
    "RANGE_GOOP"
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


  public ClassicQueryLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "ClassicQueryLexer.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u0106\b\1\b\1"+
    "\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
    "\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
    "\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
    "\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
    "\37\4 \t \4!\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5Q\n\5\3"+
    "\6\3\6\5\6U\n\6\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t"+
    "\3\t\3\t\5\tf\n\t\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
    "\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3"+
    "\23\7\23\u0083\n\23\f\23\16\23\u0086\13\23\3\23\3\23\3\24\6\24\u008b\n"+
    "\24\r\24\16\24\u008c\3\24\3\24\6\24\u0091\n\24\r\24\16\24\u0092\5\24\u0095"+
    "\n\24\3\25\3\25\7\25\u0099\n\25\f\25\16\25\u009c\13\25\3\26\3\26\6\26"+
    "\u00a0\n\26\r\26\16\26\u00a1\3\26\3\26\6\26\u00a6\n\26\r\26\16\26\u00a7"+
    "\5\26\u00aa\n\26\3\26\7\26\u00ad\n\26\f\26\16\26\u00b0\13\26\3\26\7\26"+
    "\u00b3\n\26\f\26\16\26\u00b6\13\26\5\26\u00b8\n\26\3\27\3\27\3\27\3\27"+
    "\5\27\u00be\n\27\3\30\3\30\5\30\u00c2\n\30\3\30\3\30\7\30\u00c6\n\30\f"+
    "\30\16\30\u00c9\13\30\3\31\3\31\3\31\3\31\7\31\u00cf\n\31\f\31\16\31\u00d2"+
    "\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\6\34\u00df"+
    "\n\34\r\34\16\34\u00e0\3\34\3\34\6\34\u00e5\n\34\r\34\16\34\u00e6\5\34"+
    "\u00e9\n\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
    "\3\37\3 \3 \3 \3 \6 \u00fc\n \r \16 \u00fd\3 \3 \3!\6!\u0103\n!\r!\16"+
    "!\u0104\2\2\"\5\3\7\2\t\2\13\2\r\2\17\2\21\4\23\5\25\6\27\7\31\b\33\t"+
    "\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30"+
    ";\31=\32?\33A\34C\35\5\2\3\4\f\6\2\13\f\17\17\"\"\u3002\u3002\3\2\62;"+
    "\2\2\16\2\13\f\17\17\"\"$$*,\61\61<<AA]`}}\177\u0080\u3002\u3002\4\2-"+
    "-//\4\2$$^^\4\2,,AA\3\2\61\61\3\2$$\5\2\"\"^_\177\177\u011b\2\5\3\2\2"+
    "\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
    "\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
    "\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
    "\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\4;\3\2\2\2\4=\3\2\2"+
    "\2\4?\3\2\2\2\4A\3\2\2\2\4C\3\2\2\2\5E\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13"+
    "P\3\2\2\2\rT\3\2\2\2\17X\3\2\2\2\21_\3\2\2\2\23e\3\2\2\2\25k\3\2\2\2\27"+
    "m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!x\3\2\2\2#z"+
    "\3\2\2\2%|\3\2\2\2\'\u0080\3\2\2\2)\u008a\3\2\2\2+\u0096\3\2\2\2-\u009d"+
    "\3\2\2\2/\u00bd\3\2\2\2\61\u00c1\3\2\2\2\63\u00ca\3\2\2\2\65\u00d5\3\2"+
    "\2\2\67\u00d9\3\2\2\29\u00de\3\2\2\2;\u00ec\3\2\2\2=\u00ef\3\2\2\2?\u00f3"+
    "\3\2\2\2A\u00f7\3\2\2\2C\u0102\3\2\2\2EF\t\2\2\2FG\3\2\2\2GH\b\2\2\2H"+
    "\6\3\2\2\2IJ\t\3\2\2J\b\3\2\2\2KL\7^\2\2LM\n\4\2\2M\n\3\2\2\2NQ\n\5\2"+
    "\2OQ\5\t\4\2PN\3\2\2\2PO\3\2\2\2Q\f\3\2\2\2RU\5\13\5\2SU\t\6\2\2TR\3\2"+
    "\2\2TS\3\2\2\2U\16\3\2\2\2VY\n\7\2\2WY\5\t\4\2XV\3\2\2\2XW\3\2\2\2Y\20"+
    "\3\2\2\2Z[\7C\2\2[\\\7P\2\2\\`\7F\2\2]^\7(\2\2^`\7(\2\2_Z\3\2\2\2_]\3"+
    "\2\2\2`\22\3\2\2\2ab\7Q\2\2bf\7T\2\2cd\7~\2\2df\7~\2\2ea\3\2\2\2ec\3\2"+
    "\2\2f\24\3\2\2\2gh\7P\2\2hi\7Q\2\2il\7V\2\2jl\7#\2\2kg\3\2\2\2kj\3\2\2"+
    "\2l\26\3\2\2\2mn\7-\2\2n\30\3\2\2\2op\7/\2\2p\32\3\2\2\2qr\t\4\2\2rs\5"+
    "\5\2\2s\34\3\2\2\2tu\7*\2\2u\36\3\2\2\2vw\7+\2\2w \3\2\2\2xy\7<\2\2y\""+
    "\3\2\2\2z{\7,\2\2{$\3\2\2\2|}\7`\2\2}~\3\2\2\2~\177\b\22\3\2\177&\3\2"+
    "\2\2\u0080\u0084\7$\2\2\u0081\u0083\5\17\7\2\u0082\u0081\3\2\2\2\u0083"+
    "\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2"+
    "\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7$\2\2\u0088(\3\2\2\2\u0089\u008b"+
    "\t\3\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
    "\u008d\3\2\2\2\u008d\u0094\3\2\2\2\u008e\u0090\7\60\2\2\u008f\u0091\t"+
    "\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
    "\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u0095\3\2"+
    "\2\2\u0095*\3\2\2\2\u0096\u009a\5\13\5\2\u0097\u0099\5\r\6\2\u0098\u0097"+
    "\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
    ",\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00b7\7\u0080\2\2\u009e\u00a0\5\7"+
    "\3\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
    "\u00a2\3\2\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a5\7\60\2\2\u00a4\u00a6\5"+
    "\7\3\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
    "\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00aa\3\2"+
    "\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\5\r\6\2\u00ac\u00ab\3\2\2\2\u00ad"+
    "\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b8\3\2"+
    "\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\5\r\6\2\u00b2\u00b1\3\2\2\2\u00b3"+
    "\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2"+
    "\2\2\u00b6\u00b4\3\2\2\2\u00b7\u009f\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8"+
    ".\3\2\2\2\u00b9\u00be\7,\2\2\u00ba\u00bb\5+\25\2\u00bb\u00bc\7,\2\2\u00bc"+
    "\u00be\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\60\3\2\2"+
    "\2\u00bf\u00c2\5\13\5\2\u00c0\u00c2\t\b\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
    "\u00c0\3\2\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c6\5\r\6\2\u00c4\u00c6\t\b"+
    "\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
    "\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\62\3\2\2\2\u00c9\u00c7\3\2\2"+
    "\2\u00ca\u00d0\7\61\2\2\u00cb\u00cf\n\t\2\2\u00cc\u00cd\7^\2\2\u00cd\u00cf"+
    "\7\61\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2"+
    "\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0"+
    "\3\2\2\2\u00d3\u00d4\7\61\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7]\2\2\u00d6"+
    "\u00d7\3\2\2\2\u00d7\u00d8\b\32\4\2\u00d8\66\3\2\2\2\u00d9\u00da\7}\2"+
    "\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\33\4\2\u00dc8\3\2\2\2\u00dd\u00df"+
    "\t\3\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
    "\u00e1\3\2\2\2\u00e1\u00e8\3\2\2\2\u00e2\u00e4\7\60\2\2\u00e3\u00e5\t"+
    "\3\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
    "\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e9\3\2"+
    "\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\34\5\2\u00eb:\3\2\2\2\u00ec\u00ed"+
    "\7V\2\2\u00ed\u00ee\7Q\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7_\2\2\u00f0\u00f1"+
    "\3\2\2\2\u00f1\u00f2\b\36\5\2\u00f2>\3\2\2\2\u00f3\u00f4\7\177\2\2\u00f4"+
    "\u00f5\3\2\2\2\u00f5\u00f6\b\37\5\2\u00f6@\3\2\2\2\u00f7\u00fb\7$\2\2"+
    "\u00f8\u00fc\n\n\2\2\u00f9\u00fa\7^\2\2\u00fa\u00fc\7$\2\2\u00fb\u00f8"+
    "\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
    "\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7$\2\2\u0100B\3\2\2\2\u0101"+
    "\u0103\n\13\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3"+
    "\2\2\2\u0104\u0105\3\2\2\2\u0105D\3\2\2\2\"\2\3\4PTX_ek\u0084\u008c\u0092"+
    "\u0094\u009a\u00a1\u00a7\u00a9\u00ae\u00b4\u00b7\u00bd\u00c1\u00c5\u00c7"+
    "\u00ce\u00d0\u00e0\u00e6\u00e8\u00fb\u00fd\u0104\6\b\2\2\4\3\2\4\4\2\4"+
    "\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
