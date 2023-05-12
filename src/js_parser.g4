grammar js_parser;

//lexer grammer
//Signs :
SemiColon:                      ';';
Comma:                          ',';
DolorSign:                      '$';
ComputeSigns:                   '+' | '-' | '/' | '*';
//Import
As:                             'as';
From:                           'from';
Import:                         'import';

//Variable and Consts
Const:                          'const';
Var:                            'var';
Let:                            'let';
Equals: '=';

// Tokens
//Identifier: [a-zA-Z]+ [a-zA-Z0-9_]*;

Identifier: [a-zA-Z][a-zA-Z0-9_$]+ ;

WS : [ \t\r\n]+ -> skip;
StringLiteral: '\'' ~['\r\n]* '\'' | '"' ~["\r\n]* '"';
Number: [0-9]+ ('.' [0-9]+)?;


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
    variable_declaration
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
