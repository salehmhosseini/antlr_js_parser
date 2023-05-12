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
  - multi_declaratuon
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
  ---
  ### some explanation
  We have two separate files . (lexer and parser) so that lexer file linked to parser file.
  this program should start with at least an import statement .
Inline `code`

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
   

