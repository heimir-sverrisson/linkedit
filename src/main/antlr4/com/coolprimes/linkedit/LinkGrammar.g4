grammar LinkGrammar;

spec: memoryList sectionList
    | EOF
    ;

memoryList: 'MEMORY' '{' (memoryArea)* '}' ;

memoryArea: Name MemoryType ':' 'origin=' expr 'length=' expr ;

sectionList : 'SECTIONS' '{' .*? '}' ;

expr:  expr termOperator expr
    | HexInt
    | '(' expr ')'
    ;

termOperator : '+' | '-' ;

MemoryType : '(' ('X'|'R'|'W')+ ')' ;

Whitespace   : [ \t]+ -> skip ;
Newline      : ( '\r' '\n'? | '\n' ) -> skip ;
BlockComment : '/*' .*?  '*/' -> skip ;
LineComment  : '//' ~[\r\n]* -> skip ;

HexInt : '0x' [0-9a-fA-F]+ ;
Retain : '--retain=' .*? Newline -> skip ;
Name     : [A-Z]+[0-9]* ;
ErrorCharacter : . -> skip;
