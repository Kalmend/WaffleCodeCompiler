grammar Waffle;

program: code_block* ;
body : (statement ';')+ ;

code_block : (statement ';')
           | subroutine ';'
           ;



subroutine : subroutine_header body END;
subroutine_header : SUB routine_name '(' param (',' param)* ')';
routine_name : VAR;

type_decl : '<' type '>';

type :  scalar_type
     | 'Array''<'type'>'
     ;

scalar_type : INT_TYPE
            | DBL_TYPE
            | BOOL_TYPE
            | STR_TYPE
            ;

param : (IN | OUT)? var_decl;

var_decl : variable type_decl
        | variable type_decl '=' expression;



//-------------statements-----------//
statement  : assign_statement
           | for_statement
           | if_statement
           | return_statement
           | call_statement
           | decl_statement
           ;

//conditional statements
if_statement : | IF condition ':' body (ELIF condition ':' body)* (ELSE ':' body)?  END IF ;

condition : expression;

//-----------------loops------------------//
for_statement :  for_header body END LOOP;
for_header : FOR iterator IN range_exp ':';
range_exp : expression ARROW expression;
iterator : var_decl ;
//---------------------------------------//

assign_statement : left=variable_expression '=' right=expression ;
decl_statement : var_decl;

return_statement : RETURN expression;

call_statement : call_expression;

//--------------------------------------Expressions----------------------//
expression:   '(' expression ')'                                            #expParenthesis
    |  left=expression operator=(MUL|DIV|PLUS|MINUS|EQ|GT|GTE|LT|LTE) right=expression #expBinary
    |  literal_expression                                                   #expLiteral
    |  variable_expression                                                  #expVariable
    |  operator=(HASH|NOT|MINUS) expression                                 #expUnary
    |  call_expression                                                      #NOTIMPLEMENTED1
    |  indexed_expression                                                   #expIndexed
    |  list_expression                                                      #expList
  /*|   expr expr                                                           # concat
    |   ID '[' index=expr ']'                                                 # array
    |   ID                                                                    # id
    |   '(' expr ')'                                                          # parens
    |   NULL                                                                  # null
    |   (TRUE | FALSE)                                                        # bool
    |   '-'? INT                                                              # int
    |   '-'? FLOAT                                                            # double
    |   STRING                                                                # string*/
;

call_expression : variable '(' expression (',' expression)* ')'             #expCall;

variable_expression : variable
                    | indexed_expression
                    ;

indexed_expression : variable '[' expression ']';

literal_expression : string_literal
                   | numeric_literal
                   | boolean_literal;

list_expression : '[' (expression (',' expression)*)? ']';

//------------------literals --------------------------//
string_literal : string;

numeric_literal  : integer
                 | dooble
                 ;

boolean_literal : buulean ;

variable : VAR;
integer  : INT;
dooble   : DBL;
string   : STR;
buulean  : BOOL;

//------------------------LEXER-----------------------//
INT:  [0-9]+;
DBL:  [0-9]+('.')[0-9]+;
BOOL: ('true'|'false');
STR:  '"' ( '\\'. | ~('\\'|'"') )* '"';
COMMENT: ('/*'.*?'*/' | '//'.*?'\n') -> skip;
WS : [ \t\n\r]+ -> skip;
GT : '>';
GTE : '>=';
LT : '<';
LTE : '<=';
EQ : '==';

PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
NOT: '!';
HASH: '#';
ARROW: '->';
INT_TYPE: 'Int';
DBL_TYPE: 'Double';
STR_TYPE: 'String';
BOOL_TYPE: 'Boolean';
END : 'end' | 'END';
LOOP :'loop' | 'LOOP';
FOR  :'for' | 'FOR';
IN  :'in' | 'IN';
OUT: 'OUT'| 'out';
SUB: 'SUB' | 'sub';
IF: 'IF' | 'if';
ELIF: 'ELIF' | 'elif';
ELSE : 'ELSE' | 'else';
RANGE : 'range' | 'RANGE';
RETURN : 'return' | 'RETURN';
VAR: [A-Za-z][A-Za-z0-9_]*;
