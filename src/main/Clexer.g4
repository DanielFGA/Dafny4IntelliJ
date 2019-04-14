lexer grammar Clexer;

ID : [a-zA-Z]+ ; //match identifiers
INT : [0-9]+ ;  //match integers
WS : [ \t\n\r]+ -> skip; //toss out withespace