grammar Waffle;

program: code_block* ;
body : (statement ';')+ ;

code_block : (statement ';')
           | subroutine ';'
           ;



subroutine : subroutine_header body END;
subroutine_header : SUB routine_name '(' param? (',' param)* ')' ':';
routine_name : VAR;

type_decl : '<' type '>';

type :  scalar_type
     | 'Array'
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
           | break_statement
           | call_statement
           | decl_statement
           |
           ;

//conditional statements
//if_statement : ifer=(IF condition ':' body) elifs=(ELIF condition ':' body)* elser=(ELSE ':' body)?  END IF ;
if_statement : ifer elif* elser?  END IF ;
ifer : IF condition ':' body;
elif : ELIF condition ':' body;
elser : ELSE ':' body;
condition : expression;

//-----------------loops------------------//
for_statement :  for_header body END LOOP;
for_header : FOR iterator=var_decl  IN range_exp ':';
range_exp : start=expression ARROW stop=expression;
//---------------------------------------//

assign_statement : variable_expression '=' expression
                 | indexed_expression '=' expression
                 ;
decl_statement : var_decl;

return_statement : RETURN expression? ;
break_statement : BREAK ;

call_statement : call_expression;

//--------------------------------------Expressions----------------------//
expression:   '(' expression ')'                                            #expParenthesis
    //| expBinary                     #expWhatever
    |left=expression multis right=expression                                #expBinary
    | left=expression adds right=expression                                 #expBinary
    | left=expression equalities right=expression                           #expBinary
    |  literal_expression                                                   #expLiteral
    |  variable_expression                                                  #expVariable
    |  indexed_expression                                                   #expIndexed
    |  operator=un_op expression                                            #expUnary
    |  call_expression                                                      #NOTIMPLEMENTED1
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

call_expression : variable '(' expression? (',' expression)* ')'             #expCall;
/*expBinary: left=expression multis right=expression
    | left=expression adds right=expression
    | left=expression equalities right=expression
    ;*/
bin_op : multis|adds|equalities;
adds: PLUS|MINUS;
multis : MUL|DIV|MOD;
equalities : EQ|NEQ|GT|GTE|LT|LTE;

un_op : NOT|MINUS;

variable_expression : variable;

indexed_expression : variable ('[' index=expression ']')+;

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
NEQ : '!=';

PLUS: '+';
MINUS: '-';
MUL: '*';
MOD: '%';
DIV: '/';
NOT: '!';
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
BREAK : 'break' | 'BREAK';
VAR: [A-Za-z][A-Za-z0-9_]*;
