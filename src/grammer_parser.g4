parser grammar grammer_parser;

//lexer grammer
options {
    tokenVocab = grammer_lexer;
}


program
    : sourceElements EOF
    ;

sourceElements
    : statement
    ;

// Start the program with import statement
statement
    :
     import_statement+ statements*
    ;
statements
    :
    variable_declaration
    | for_loop
    | while_loop
    | do_while_loop
    | if_statement
    | modern_if_statement
    | assignments
    | switch_case_statement
    | class_statement
    | function_statement
    | exception_statement
    | comment_statement
    | logical_expression
    ;

//import rules
import_statement: DolorSign (Import import_content);

import_content: import_default
        | import_from
        | import_all
        | import_multiple_named
        | import_alias
        ;

import_default:
    StringLiteral SemiColon;

import_from:
    Identifier (As Identifier)? From StringLiteral SemiColon;

import_all:
    Star As Identifier From StringLiteral SemiColon;

import_multiple_named:
    Identifier (Comma Identifier)* From StringLiteral SemiColon;

import_alias:
    StringLiteral (As Identifier) SemiColon;

// Define and init variables and consts ;
variable_declaration:
    DolorSign variable_type (single_declaration |multi_declaratuon)  SemiColon;

variable_type:
      Let
    | Var
    | Const;

single_declaration :
      single_decl_with_type
    | single_decl_with_init;

single_decl_with_type:
    Identifier;

single_decl_with_init:

    single_decl_with_type Assign single_expression;

single_expression:
       Number
     | Identifier
     | Number (ComputeSigns+) Number;

multi_declaratuon :
    multi_decl_with_type
  | multi_decl_with_init;

multi_decl_with_type :
    (Identifier Comma Identifier)+;

multi_decl_with_init :
    multi_decl_with_type Assign multi_expression;

multi_expression :
    (Number Comma Number)
   |(Identifier Comma Identifier)
   |(Number (ComputeSigns+) Number ) Comma (Number (ComputeSigns+) Number ) ;
// Loops

//For Loop
for_loop :
For (normal_for| for_in |for_of);

normal_for :
    OpenParen (variable_declaration|DataTypes assignments) SemiColon condition SemiColon for_update CloseParen OpenBrace loop_block CloseBrace ;

condition:
    (Identifier|Char) RelationalOperator Number (LogicalOperator (Identifier|Char) RelationalOperator Number )*;

for_update:
    (Identifier Des_In_CreamentOprators)
    |(Identifier RelationalOprators Number);

loop_block :
    statements*;


for_in :
  OpenParen (Char | Identifier) In Identifier CloseParen OpenBrace loop_block CloseBrace;

for_of:
  OpenParen (Char | Identifier) Of Identifier CloseParen OpenBrace  loop_block CloseParen CloseBrace;

//While
while_loop :
    While OpenParen condition CloseParen OpenBrace loop_block CloseBrace;

//Do - While
do_while_loop:
    do_statement while_statement ;

do_statement :
    Do OpenBrace loop_block CloseBrace;

while_statement :
    While OpenParen condition CloseParen  SemiColon;

// Conditions

//If
if_statement :
    if_expression (elif_expression (else_statement)? )? ;

if_expression:
    If OpenParen condition CloseParen OpenBrace if_block CloseBrace;

if_block :
    statements;

elif_expression:
    ElseIf OpenParen condition CloseParen OpenBrace if_block CloseBrace;

else_statement:
    Else OpenBrace if_block CloseBrace;

//Modern If
modern_if_statement:
    ((Return (Number|StringLiteral))| assignments) QuestionMark (StringLiteral | Number) Colon (StringLiteral | Number) SemiColon;


// Switch - Case
switch_case_statement:
    (Switch|Match) Identifier OpenBrace (case_statement)* default_statement CloseBrace;

case_statement:
    Case (Number|StringLiteral) Colon statements* Break SemiColon;

default_statement: Default Colon statements* Break SemiColon;

// Assignment
assignments:
    ((Identifier Assign StringLiteral) |(Identifier Assign Number)| (Identifier RelationalOprators Number) ) SemiColon?;

// Class Statement

class_statement:
    Class Identifier  OpenBrace constructor CloseBrace ;

constructor:
    Constructor  OpenParen(Identifier (Comma Identifier)*)CloseParen OpenBrace statements* CloseBrace;

// function statement
function_statement:
    Function_ Identifier OpenParen (DataTypes Identifier (Comma DataTypes Identifier)*)CloseParen OpenBrace statements* Return Identifier SemiColon CloseBrace;


// Exception Handeling
exception_statement:
    try_statement (catch_statement)? finally_statement ;

try_statement:
    Try OpenBrace statements* CloseBrace ;

catch_statement:
    Catch OpenParen Identifier CloseParen OpenBrace statements* CloseBrace;

finally_statement:
    Finally OpenBrace statements* CloseBrace ;

//Comment Statement
comment_statement:
    SingleLineComment
  | MultiLineComment;

// Set the priority of logical operators
logical_expression : logicalOrExpression;
logicalOrExpression : logicalAndExpression (LogicalOr logicalAndExpression)*;
logicalAndExpression : equalityExpression (LogicalAnd equalityExpression)*;
equalityExpression : relationalExpression ((Equalsw | NotEquals) relationalExpression)*;
relationalExpression : additiveExpression ((RelationalOperatorw | InequalityOperator) additiveExpression)*;
additiveExpression : multiplicativeExpression ((Plus | Minus) multiplicativeExpression)*;
multiplicativeExpression : unaryExpression ((Multiply | Divide | IntegerDivide) unaryExpression)*;
unaryExpression : powerExpression | UnaryOperator unaryExpression;
powerExpression : primaryExpression (Power unaryExpression)?;
primaryExpression : Identifier | Number logical_expression | '(' logical_expression ')' | '-' primaryExpression | Tt primaryExpression;

