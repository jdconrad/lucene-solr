lexer grammar ClassicQueryLexer;

WHITESPACE: [ \t\n\r\u3000] -> skip;

fragment NUM_CHAR: [0-9];
fragment ESCAPED_CHAR: '\\' ~[];
fragment TERM_START_CHAR
    : ~[ \t\n\r\u3000+-!():^\[\]"{}~*?\\/]
    | ESCAPED_CHAR
    ;
fragment TERM_CHAR
    : TERM_START_CHAR
    | '-'
    | '+'
    ;
fragment QUOTED_CHAR
    : ~["\\]
    | ESCAPED_CHAR
    ;

AND
    : 'AND'
    | '&&'
    ;
OR
    : 'OR'
    | '||'
    ;
NOT
    : 'NOT'
    | '!'
    ;
PLUS: '+';
MINUS: '-';
BAREOPER: [+-!] WHITESPACE;
LPAREN: '(';
RPAREN: ')';
COLON: ':';
STAR: '*';
CARAT: '^' -> mode(BOOST_MODE);
QUOTED: '"' QUOTED_CHAR* '"';
NUMBER: [0-9]+ ( '.' [0-9]+ )?;
TERM: TERM_START_CHAR TERM_CHAR*;
FUZZY_SLOP: '~' ( NUM_CHAR+ ( ( '.' NUM_CHAR+ )? TERM_CHAR* ) | TERM_CHAR* );
PREFIXTERM
    : '*'
    | TERM '*'
    ;
WILDTERM: ( TERM_START_CHAR | [*?] ) ( TERM_CHAR | [*?] )*;
REGEXPTERM: '/' ( ~'/' | '\\/' )* '/';
RANGE_IN_START: '[' -> mode(RANGE_MODE);
RANGE_EX_START: '{' -> mode(RANGE_MODE);

mode BOOST_MODE;

BOOST_NUMBER: [0-9]+ ( '.' [0-9]+ )? -> mode(DEFAULT_MODE);

mode RANGE_MODE;

RANGE_TO: 'TO';
RANGE_IN_END: ']' -> mode(DEFAULT_MODE);
RANGE_EX_END: '}' -> mode(DEFAULT_MODE);
RANGE_QUOTED: '"' ( ~'"' | '\\"' )+ '"';
RANGE_GOOP: ~[ \]}]+;
