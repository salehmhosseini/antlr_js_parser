grammar tmp;


// Lexer rules
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
SEMI_COLON: ';';
IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;
INTEGER: [0-9]+;
WS: [ \t\r\n]+ -> skip;

// Parser rules
program: statement EOF;

statement: for_loop_condition;

for_loop_condition: OPEN_PAREN initialization? SEMI_COLON condition? SEMI_COLON increment? CLOSE_PAREN;

initialization: expression;

condition: expression;

increment: expression;

expression: logical_expression |    additive_expression;

logical_expression: expression (LogicalOperator expression)*;


additive_expression: multiplicative_expression (AdditiveOperator multiplicative_expression)*;

multiplicative_expression: unary_expression (MultiplicativeOperator unary_expression)*;

unary_expression: UnaryOperator? primary_expression;

primary_expression: INTEGER | IDENTIFIER;

// Lexer rules for operators
LogicalOperator: '&&' | '||';
AdditiveOperator: '+' | '-';
MultiplicativeOperator: '*' | '/';
UnaryOperator: '-' | '!';





