package DafnyLanguage;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static DafnyLanguage.psi.impl.DafnyTypeImpl.*;

%%

%{
  public _DafnyLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _DafnyLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

BOOL=bool
CHAR=char
INT=int
NATTOKEN=nat
REAL=real
ORDINAL=ORDINAL
OBJECT=object
OBJECT_Q=object?
STRING=string
SET=set
ISET=iset
MULTISET=multiset
SEQ=seq
MAP=map
IMAP=imap
COLON=:
COMMA=,
VERTICALBAR=\|
DOUBLECOLON=::
GETS=:=
BOREDSMILEY=:\|
BULLET=\u2022
TWODOTS=\.\.
DOT=\.
BACKTICK=`
SEMI=;
DARROW==>
ASSUME=assume
CALC=calc
CASE=case
THEN=then
ELSE=else
AS=as
BY=by
IN=in
DECREASES=decreases
INVARIANT=invariant
FUNCTION=function
PREDICATE=predicate
INDUCTIVE=inductive
TWOSTATE=twostate
COPREDICATE=copredicate
LEMMA=lemma
STATIC=static
PROTECTED=protected
IMPORT=import
EXPORT=export
CLASSTOKEN=class
TRAIT=trait
DATATYPE=datatype
CODATATYPE=codatatype
VAR=var
CONST=const
NEWTYPE=newtype
TYPE=type
ITERATOR=iterator
METHOD=method
COLEMMA=colemma
CONSTRUCTOR=constructor
MODIFIES=modifies
READS=reads
REQUIRES=requires
ENSURES=ensures
GHOST=ghost
WITNESS=witness
INCLUDE=include
ABSTRACT=abstract
MODULE=module
REFINES=refines
PROVIDES=provides
REVEALS=reveals
EXTENDS=extends
YIELDS=yields
RETURNS=returns
NEW=new
COMETHOD=comethod
FREE=free
LABEL=label
BREAK=break
IF=if
WHILE=while
MATCH=match
ASSERT=assert
PRINT=print
FORALLTOKEN=forall
PARALLEL=parallel
MODIFY=modify
FALSE=false
TRUE=true
NULL=null
THIS=this
FRESH=fresh
ALLOCATED=allocated
UNCHANGED=unchanged
OLD=old
EXISTSTOKEN=exists
OPENED=opened
YIELD=yield
WHERE=where
RETURN=return
PLUS=\+
MINUS=\-
ASSIGN==
BOOLAND=&&
BOOLOR=\|\|
LBRACE=\{
RBRACE=\}
LBRACKET=\[
RBRACKET=\]
OPENPAREN=\(
CLOSEPAREN=\)
EQ===
NEQ=\!=
NEQALT=\u2260
STAR=\*
ELLIPSIS=\.\.\.
REVEAL=reveal
OPENANGLEBRACKET=<
CLOSEANGLEBRACKET=>
CHARTOKEN=([']([^(\\)(\\\\)\r\n]|\'|\\\"|\\\\|\\0|\\n|\\r|\\t|\\u[0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f])')
STRINGTOKEN=([\"]([^\"\\\\\r\n]|\'|\\\"|\\\\|\\0|\\n|\\r|\\t|\\u[0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f])*)\"|@\"([^\"]|\"\")*\"
NOTIN=\!in
DIGITS=[0-9](_)?([0-9])*
HEXDIGITS=0x([0-9A-Fa-f])(_)?([0-9A-Fa-f])*
DECIMALDIGITS=[0-9][_]?([0-9])*.([0-9])[_]?([0-9])*
ARRAYTOKEN=array([1-9])(([0-9])*)?
ARRAYTOKEN_Q=array([1-9])(([0-9])*)?[?]
BVTOKEN=bv(0|([1-9])([0-9])* )
IDENTDEF=([A-Zb-z?])([A-ZZa-z_?0-9])*|a(([A-Za-z_?0-9])([A-Za-z_?0-9])*)?|ar(([A-Za-qs-z_?0-9])([A-Za-z_?0-9])*)?|arr(([A-Zb-z_?0-9])([A-Za-z_?0-9])*)?|arra(([A-Za-xz_?0-9])([A-Za-yz_?0-9])*)?|array([A-Za-z_?0])([A-Za-z_?0-9])*|array?([A-Za-z_?0-9])([A-Za-z_?0-9])*|array([1-9])([0-9])*([A-Za-z_])([A-Za-z_?0-9])*|array([1-9])([0-9])*?([A-Za-z_?0-9])([A-Za-z_?0-9])*|b(([A-Za-uwxyz_?0-9])([A-Za-z_?0-9])*)?|bv(([A-Za-z_?])([A-Za-z_?0-9])*)?|bv0([A-Za-z_?0-9])([A-Za-z_?0-9])*|bv([1-9])([A-Za-z_?0-9])*([A-Za-z_?])([A-Za-z_?0-9])*|'([A-Za-z_?0-9])?|'[A-Za-z_?0-9][A-Za-z_?0-9]|'[A-Za-z_?0-9][A-Za-z'_?0-9][A-Za-z_?0-9]([A-Za-z_?0-9])*
COMMENT=\/\/.*|[/][*][^*]*[*]+([^*/][^*]*[*]+)*[/]
WHITE_SPACE=[ \t\n\x0B\f\r]+
EOF=\Z

%%
<YYINITIAL> {
  {WHITE_SPACE}            { /*ignore*/ }


  {BOOL}                   { return BOOL; }
  {CHAR}                   { return CHAR; }
  {INT}                    { return INT; }
  {NATTOKEN}               { return NATTOKEN; }
  {REAL}                   { return REAL; }
  {ORDINAL}                { return ORDINAL; }
  {OBJECT}                 { return OBJECT; }
  {OBJECT_Q}               { return OBJECT_Q; }
  {STRING}                 { return STRING; }
  {SET}                    { return SET; }
  {ISET}                   { return ISET; }
  {MULTISET}               { return MULTISET; }
  {SEQ}                    { return SEQ; }
  {MAP}                    { return MAP; }
  {IMAP}                   { return IMAP; }
  {COLON}                  { return COLON; }
  {COMMA}                  { return COMMA; }
  {VERTICALBAR}            { return VERTICALBAR; }
  {DOUBLECOLON}            { return DOUBLECOLON; }
  {GETS}                   { return GETS; }
  {BOREDSMILEY}            { return BOREDSMILEY; }
  {BULLET}                 { return BULLET; }
  {TWODOTS}                { return TWODOTS; }
  {DOT}                    { return DOT; }
  {BACKTICK}               { return BACKTICK; }
  {SEMI}                   { return SEMI; }
  {DARROW}                 { return DARROW; }
  {ASSUME}                 { return ASSUME; }
  {CALC}                   { return CALC; }
  {CASE}                   { return CASE; }
  {THEN}                   { return THEN; }
  {ELSE}                   { return ELSE; }
  {AS}                     { return AS; }
  {BY}                     { return BY; }
  {IN}                     { return IN; }
  {DECREASES}              { return DECREASES; }
  {INVARIANT}              { return INVARIANT; }
  {FUNCTION}               { return FUNCTION; }
  {PREDICATE}              { return PREDICATE; }
  {INDUCTIVE}              { return INDUCTIVE; }
  {TWOSTATE}               { return TWOSTATE; }
  {COPREDICATE}            { return COPREDICATE; }
  {LEMMA}                  { return LEMMA; }
  {STATIC}                 { return STATIC; }
  {PROTECTED}              { return PROTECTED; }
  {IMPORT}                 { return IMPORT; }
  {EXPORT}                 { return EXPORT; }
  {CLASSTOKEN}             { return CLASSTOKEN; }
  {TRAIT}                  { return TRAIT; }
  {DATATYPE}               { return DATATYPE; }
  {CODATATYPE}             { return CODATATYPE; }
  {VAR}                    { return VAR; }
  {CONST}                  { return CONST; }
  {NEWTYPE}                { return NEWTYPE; }
  {TYPE}                   { return TYPE; }
  {ITERATOR}               { return ITERATOR; }
  {METHOD}                 { return METHOD; }
  {COLEMMA}                { return COLEMMA; }
  {CONSTRUCTOR}            { return CONSTRUCTOR; }
  {MODIFIES}               { return MODIFIES; }
  {READS}                  { return READS; }
  {REQUIRES}               { return REQUIRES; }
  {ENSURES}                { return ENSURES; }
  {GHOST}                  { return GHOST; }
  {WITNESS}                { return WITNESS; }
  {INCLUDE}                { return INCLUDE; }
  {ABSTRACT}               { return ABSTRACT; }
  {MODULE}                 { return MODULE; }
  {REFINES}                { return REFINES; }
  {PROVIDES}               { return PROVIDES; }
  {REVEALS}                { return REVEALS; }
  {EXTENDS}                { return EXTENDS; }
  {YIELDS}                 { return YIELDS; }
  {RETURNS}                { return RETURNS; }
  {NEW}                    { return NEW; }
  {COMETHOD}               { return COMETHOD; }
  {FREE}                   { return FREE; }
  {LABEL}                  { return LABEL; }
  {BREAK}                  { return BREAK; }
  {IF}                     { return IF; }
  {WHILE}                  { return WHILE; }
  {MATCH}                  { return MATCH; }
  {ASSERT}                 { return ASSERT; }
  {PRINT}                  { return PRINT; }
  {FORALLTOKEN}            { return FORALLTOKEN; }
  {PARALLEL}               { return PARALLEL; }
  {MODIFY}                 { return MODIFY; }
  {FALSE}                  { return FALSE; }
  {TRUE}                   { return TRUE; }
  {NULL}                   { return NULL; }
  {THIS}                   { return THIS; }
  {FRESH}                  { return FRESH; }
  {ALLOCATED}              { return ALLOCATED; }
  {UNCHANGED}              { return UNCHANGED; }
  {OLD}                    { return OLD; }
  {EXISTSTOKEN}            { return EXISTSTOKEN; }
  {OPENED}                 { return OPENED; }
  {YIELD}                  { return YIELD; }
  {WHERE}                  { return WHERE; }
  {RETURN}                 { return RETURN; }
  {PLUS}                   { return PLUS; }
  {MINUS}                  { return MINUS; }
  {ASSIGN}                 { return ASSIGN; }
  {BOOLAND}                { return BOOLAND; }
  {BOOLOR}                 { return BOOLOR; }
  {LBRACE}                 { return LBRACE; }
  {RBRACE}                 { return RBRACE; }
  {LBRACKET}               { return LBRACKET; }
  {RBRACKET}               { return RBRACKET; }
  {OPENPAREN}              { return OPENPAREN; }
  {CLOSEPAREN}             { return CLOSEPAREN; }
  {EQ}                     { return EQ; }
  {NEQ}                    { return NEQ; }
  {NEQALT}                 { return NEQALT; }
  {STAR}                   { return STAR; }
  {ELLIPSIS}               { return ELLIPSIS; }
  {REVEAL}                 { return REVEAL; }
  {OPENANGLEBRACKET}       { return OPENANGLEBRACKET; }
  {CLOSEANGLEBRACKET}      { return CLOSEANGLEBRACKET; }
  {CHARTOKEN}              { return CHARTOKEN; }
  {STRINGTOKEN}            { return STRINGTOKEN; }
  {NOTIN}                  { return NOTIN; }
  {DIGITS}                 { return DIGITS; }
  {HEXDIGITS}              { return HEXDIGITS; }
  {DECIMALDIGITS}          { return DECIMALDIGITS; }
  {ARRAYTOKEN}             { return ARRAYTOKEN; }
  {ARRAYTOKEN_Q}           { return ARRAYTOKEN_Q; }
  {BVTOKEN}                { return BVTOKEN; }
  {IDENTDEF}               { return IDENTDEF; }
  {COMMENT}                { return COMMENT; }
  {WHITE_SPACE}            { /*ignore*/ }
  {EOF}                    { return EOF; }

}

[^] { return BAD_CHARACTER; }
