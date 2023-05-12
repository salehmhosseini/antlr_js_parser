grammar js_parser;

//lexer grammer
//Signs :
SemiColon:                      ';';
Comma:                          ',';
DolorSign:                      '$';
ComputeSigns:                   '+' | '-' | '/' | '*' | '**' | '%';
LogicalOperator:                '&&' | '||';
RelationalOperator:              '<' | '>' | '<=' | '>=' | '==' | '!=' | '===' | '!==' ;

//relational oprators
Des_In_CreamentOprators:        '++' | '--' |;
RelationalOprators :            '+=' | '-=' | '/=' | '*=' ;

//Import
As:                             'as';
From:                           'from';
Import:                         'import';

//Variable and Consts
Const:                          'const';
Var:                            'var';
Let:                            'let';
Equals: '=';

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

// Tokens
//Identifier: [a-zA-Z]+ [a-zA-Z0-9_]*;

Identifier: [a-zA-Z][a-zA-Z0-9_$]+ ;
Char :  [a-zA-Z];
WS : [ \t\r\n]+ -> skip;
StringLiteral: '\'' ~['\r\n]* '\'' | '"' ~["\r\n]* '"';

Number: '-'? DecimalNumber Exponent?;
DecimalNumber: Integer ('.' Integer)?;
Exponent: [eE] ('+' | '-')? Integer;
Integer: [0-9]+;

/*
Number: '-'? DecimalNumber Exponent?;
DecimalNumber: OneDigit '.' Integer | Integer ('.' Integer)?;
Exponent: [eE] ('+' | '-')? Integer;
Integer: [0-9]+;
OneDigit: [0-9];
*/

program
    : sourceElements EOF
    ;

sourceElements
    : statement
    ;

statement
    :
     import_statement+ statements
    ;
statements
    :
    variable_declaration|
    for_loop
    ;
// Parser rules

//import rules
import_statement: DolorSign (Import import_content);

import_content: import_default
        | import_from
        | import_all
        | import_multiple_named
        | import_alias;

import_default: StringLiteral SemiColon;

import_from: Identifier (As Identifier)? From StringLiteral SemiColon;

import_all: Comma As Identifier From StringLiteral SemiColon;

import_multiple_named: Identifier (',' Identifier)* From StringLiteral SemiColon;

import_alias: StringLiteral (As Identifier)? SemiColon;

// Define and init variables and consts ;

variable_declaration: DolorSign variable_type (single_declaration |multi_declaratuon)  SemiColon;
variable_type: Let | Var | Const;

single_declaration : single_decl_with_type | single_decl_with_init;
single_decl_with_type: Identifier;
single_decl_with_init: single_decl_with_type Equals single_expression;
single_expression: Number |Identifier | Number (ComputeSigns+) Number;

 multi_declaratuon : multi_decl_with_type | multi_decl_with_init;
 multi_decl_with_type : (Identifier Comma Identifier)+;
 multi_decl_with_init : multi_decl_with_type Equals multi_expression;
 multi_expression : (Number Comma Number) |
                    (Identifier Comma Identifier) |
                    (Number (ComputeSigns+) Number ) Comma (Number (ComputeSigns+) Number ) ;
// loops

//for loop
for_loop :For (normal_for| for_in |for_of);
 normal_for :
 OpenParen variable_declaration Comma condition SemiColon for_update CloseParen OpenBrace loop_block CloseBrace ;

condition:  Identifier RelationalOperator Number (LogicalOperator Identifier RelationalOperator Number )*;
for_update:(Identifier Des_In_CreamentOprators)|(Identifier RelationalOprators Number);
loop_block : Identifier;
// Lexer rules for operators



//In this modified grammar, the loop_condition rule includes three expressions separated by semicolons. The first expression represents the loop condition, the second expression represents the increment/decrement operation, and the third expression is optional.
//
//Please note that this grammar assumes a C-like syntax where the loop condition and increment/decrement expressions are separated by semicolons. You can adjust the grammar as needed to match the syntax of your target language.
//



for_in :
 Char | Identifier In Identifier OpenBrace loop_block CloseBrace;

for_of:
 Char | Identifier Of Identifier OpenBrace loop_block CloseBrace;






















