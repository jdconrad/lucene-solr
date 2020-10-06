parser grammar ClassicQueryParser;

options { tokenVocab=ClassicQueryLexer; }

top
    : query EOF
    ;

query
    : first_clause conjunction_clause*
    ;

first_clause
    : multi_term
    | modifiers clause
    ;
conjunction_clause
    : multi_term
    | conjunction modifiers clause
    ;

multi_term
    : TERM+
    ;

clause
    : clause_field? clause_term
    ;

clause_field
    : TERM COLON
    | STAR COLON
    ;
clause_term
    : term
    | LPAREN query RPAREN boost?
    ;

term
    : simple_term
    | quoted_term
    | range_term
    ;

simple_term
    : ( TERM | STAR | PREFIXTERM | WILDTERM | REGEXPTERM | NUMBER | BAREOPER ) boost_or_fuzzy_boost?
    ;
quoted_term
    : QUOTED boost_or_fuzzy_boost?
    ;
range_term
    : range_start range_first RANGE_TO range_second range_end boost?
    ;

range_first
    : range_part
    ;
range_second
    : range_part
    ;

range_start
    : RANGE_IN_START
    | RANGE_EX_START
    ;
range_part
    : RANGE_GOOP
    | RANGE_QUOTED
    | RANGE_TO
    ;
range_end
    : RANGE_IN_END
    | RANGE_EX_END
    ;

boost_or_fuzzy_boost
    : boost
    | FUZZY_SLOP boost?
    ;
boost
    : CARAT BOOST_NUMBER
    ;

modifiers
    : PLUS
    | MINUS
    | NOT
    ;
conjunction
    : AND
    | OR
    ;