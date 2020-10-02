parser ClassicQueryParser;

query: clause+ EOF;
first_clause: ( PLUS | MINUS )? (term COLON)? (term | query)
multi_clause:
term:

WS: [ \t\n\r\u3000]+;

NUM_CHAR: [0-9];

ESCAPED_CHAR: '\\' ~[];

TERM_START_CHAR
    : ~[ \t\n\r\u3000+-!():^[]\"{}~*?\\/]
    | ESCAPED_CHAR
    ;

TERM_CHAR
    : TERM_START_CHAR>
    | '-'
    | '+'
    ;

QUOTED_CHAR
    : ~[\\"]
    | <_ESCAPED_CHAR>
    ;

AND: 'AND' | '&&';
OR: 'OR' | '||';
NOT: 'NOT' | '!';
PLUS: '+';
MINUS: '-'
BAREOPER: ("+"|"-"|"!") WS
LPAREN:        '(';
RPAREN:        ')';
COLON:         ':';
STAR:          '*';
CARAT:         '^';
QUOTED:        '"' QUOTED_CHAR* '"';
TERM:          TERM_START_CHAR> (TERM_CHAR)*
FUZZY_SLOP: '~' (NUM_CHAR+ (( '.' NUM_CHAR+ )? TERM_CHAR* ) | TERM_CHAR* );
PREFIXTERM:    '*' | TERM_START_CHAR TERM_CHAR* '*' );
WILDTERM:      (TERM_START_CHAR | [*?]) (TERM_CHAR | ( [ '*', '?' ] ))*;
REGEXPTERM:    '/' (~[ '/' ] | '\\/' )* '/' >
RANGEIN_START: '[' > : Range
RANGEEX_START: '{' > : Range

<Boost> TOKEN : {
  <NUMBER: (<_NUM_CHAR>)+ ( "." (<_NUM_CHAR>)+ )? > : DEFAULT
}

<Range> TOKEN : {
  <RANGE_TO:     "TO">
| <RANGEIN_END:  "]"> : DEFAULT
| <RANGEEX_END:  "}"> : DEFAULT
| <RANGE_QUOTED: "\"" (~["\""] | "\\\"")+ "\"">
| <RANGE_GOOP:   (~[ " ", "]", "}" ])+ >
}