lexer grammar grammer_lexer;

//Signs :
SemiColon:                      ';';
Comma:                          ',';
DolorSign:                      '$';
QuestionMark:                   '?';
Colon:                          ':';
Star:                           '*';

//Operations
ComputeSigns:                   '+' | '-' | '/' | '*' | '**' | '%';
Des_In_CreamentOprators:        '++' | '--' |;

// Operators
LogicalOperator:                '&&' | '||';
RelationalOperator:              '<' | '>' | '<=' | '>=' | '==' | '!=' | '===' | '!==' ;

//relational oprators
RelationalOprators :            '+=' | '-=' | '/=' | '*=' ;
Assign:                         '=';
Equals:                         '=';

//Import
As:                             'as';
From:                           'from';
Import:                         'import';

//Variable and Consts
Const:                          'const';
Var:                            'var';
Let:                            'let';

// Bracket - Brace - Parenthesis
OpenBracket:                    '[';
CloseBracket:                   ']';
OpenParen:                      '(';
CloseParen:                     ')';
OpenBrace:                      '{';
CloseBrace:                     '}';

//For loop
For:                            'for';
In:                             'in';
Of:                             'of';
Continue:                       'continue';
Break:                          'break';

//While loop
While:                          'while';
Do:                             'do';

//Conditional
If:                             'if';
Else:                           'else';
ElseIf:                         'elif';

Switch:                         'switch';
Match:                          'match';
Case:                           'case';
Default:                        'default';
Finally:                        'finally';

//Class
Class:                          'class';
Constructor:                    'constructor';
This:                           'this';
New:                            'new';
Return:                         'return';

// Data types
DataTypes:                      'int' | 'float' | 'double' | 'long' | 'short';
Function_:                      'function';

// Exception Handeling
Try:                            'try';
Catch:                          'catch';


// Tokens
Identifier: [a-zA-Z][a-zA-Z0-9_$]+ ;
Char :  [a-zA-Z];
WS : [ \t\r\n]+ -> skip;
StringLiteral: '\'' ~['\r\n]* '\'' | '"' ~["\r\n]* '"';
Number: '-'? DecimalNumber Exponent?;
DecimalNumber: Integer ('.' Integer)?;
Exponent: [eE] ('+' | '-')? Integer;
Integer: [0-9]+;

// Comment
SingleLineComment: '//' ~[\r\n]* -> channel(HIDDEN);
MultiLineComment: '/*' .*? '*/' -> channel(HIDDEN);



// for priority
Plus : '+';
Minus : '-';
Multiply : '*';
Divide : '/';
IntegerDivide : '//';
Power : '**';
LogicalAnd : '&&';
LogicalOr : '||';
Equalsw  : '==';
NotEquals : '!=';
RelationalOperatorw : '<' | '>' | '<=' | '>=';
InequalityOperator : '<>';
UnaryOperator : '++' | '--' | '+' | '-' | '!' | '~';
Tt: '###';
