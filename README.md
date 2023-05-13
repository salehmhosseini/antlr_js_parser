# Antlr Project
**Design structure of a language similar to JS (Java Script) with antlr**
---
### Implemented Statements 
+ Import Statement
  - import_default
  - import_from
  - import_all
  - import_multiple_named
  - import_alias
+ Variable Decleration 
  - single_declaration
  - multi_declaration
+ Class Statement
+ For Loop Statement
  - normal_for
  - for_in
  - for_of
+ Function Statement
+ If Statement
  - if
  - elif (else if)
  - else
+ Switch Case Statement
  - switch
  - case
  - default
+ Try Catch Statement
  - try
  - catch
  - finally
+ While Loop Statement
  - while
  - do - while
  ---
  ### Some explanation
  We have two separate files . ([lexer](https://github.com/salehmhosseini/university_antlr_project/blob/main/src/grammer_lexer.g4/ "Lexer Code") and [parser](https://github.com/salehmhosseini/university_antlr_project/blob/main/src/grammer_parser.g4/ "Parser Code")) so that lexer file linked to parser file.
  this program should start with at least an import statement . <br>
  start program `code`

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
   And any defined statements can come after that  <br>
   `code`
  
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
---
> ## some screenshots from structured trees

**Class Statement**
![Class](https://github.com/salehmhosseini/university_antlr_project/blob/main/screenshots/Class.png)
---

**If Statement**
![If](https://github.com/salehmhosseini/university_antlr_project/blob/main/screenshots/If.png)
---

**Exception Statement**
![Try_Catch](https://github.com/salehmhosseini/university_antlr_project/blob/main/screenshots/Try_Catch.png)








