grammar test;
import Clexer;

dafny
:
 ('include' 'stringtoken'
 )* (topdecl)*
 EOF;

declmodifier
: ( 'abstract'
 | 'ghost'
 | 'static'
 | 'protected'
 );

topdecl
:
 (declmodifier)*
 (
     submoduledecl
     | classdecl
     | datatypedecl
     | newtypedecl
     | othertypedecl
     | iteratordecl
     | traitdecl
     | classmemberdecl
 );

submoduledecl
:
 (
    'module' (attribute)* nousident ('.' nousident)* ('refines' modulename)? '{' (topdecl)* '}'
    | 'import' ('opened')? modulename
    (
        (qualifiedmoduleexportsuffix)?
        | '=' qualifiedmoduleexport
        | ':' qualifiedmoduleexport
    )
    (';')?
    | 'export' (moduleexport)?
    (
        'provides'
        (
            ( moduleexportsignature (',' moduleexportsignature)* )
            | '*'
        )
        | 'reveals'
        (
            ( moduleexportsignature (',' moduleexportsignature )* )
            | '*'
        )
        | 'extends' moduleexport (',' moduleexport )* )*
 );

moduleexportsignature:nousident ('.' nousident)?;

modulename:ident;

moduleexport:dotsuffix;

qualifiedmoduleexportsuffix
:
 (
    '.' modulename ('.' modulename )*
    | ' ' (
        moduleexport
        | '{' moduleexport (',' moduleexport )* '}'
    )
 );

qualifiedmoduleexport:modulename (qualifiedmoduleexportsuffix)?;

classdecl
:
 'class' (attribute)* nousident (genericparameters)?
 (
    'extends' typeandtoken (',' typeandtoken )*
  )?
  '{'
 ( (declmodifier)* classmemberdecl)* '}';

traitdecl
:
 'trait' (attribute)* nousident (genericparameters)? '{'
 (
    (declmodifier)* classmemberdecl
 )*
 '}';

classmemberdecl
:
 (
     fielddecl
     | constantfielddecl
     | functiondecl
     | methoddecl
 );

datatypedecl
:
 (
    'datatype'
    | 'codatatype'
 )
 (attribute)* nousident (genericparameters)? '=' ('|')? datatypememberdecl ('|' datatypememberdecl)* (';')?;

datatypememberdecl:(attribute)* nousident (formalsoptionalids)?;

fielddecl:'var' (attribute)* fidenttype (',' fidenttype)* oldsemi;

constantfielddecl:'const' (attribute)* cidenttype (':=' expression)? oldsemi;

newtypedecl
:
 'newtype' (attribute)* nousident '='
 (
     nousident (':' typeandtoken)? '|' expression
     (
        ('ghost')? 'witness' expression
     )?
     | typeandtoken
 );

othertypedecl
:
 'type' (attribute)* nousident
 (typeparametercharacteristics)* (genericparameters)?
 ('='
     (
         nousident (':' typeandtoken)? '|' expression
         (
            ('ghost')? 'witness' expression
         )?
         | typeandtoken
        )
    )?
 (';')?;

gidenttype:('ghost'|'new')* identtype;

fidenttype : ( wildident|'digits') ':' typeandtoken;

cidenttype
: (wildident|'digits') (':' typeandtoken)?;

identtype:wildident ':' typeandtoken;

localidenttypeoptional:wildident (':' typeandtoken)?;

identtypeoptional:wildident (':' typeandtoken)?;

typeidentoptional
:
 ('ghost')? (
    typeandtoken (':' typeandtoken)?
    | 'digits' ':'typeandtoken
 );

/*------------------------------------------------------------------------*/

iteratordecl
:
 'iterator' (attribute)* nousident
 (
     (genericparameters)? formals
     (( 'yields'|'returns') formals)?
     | '...'
 )
 (iteratorspec)* (blockstmt)?;

/*------------------------------------------------------------------------*/

genericparameters
:
  '<'
    (variance)? nousident (typeparametercharacteristics)*
    (','( variance)? nousident (typeparametercharacteristics)*)*
  '>';

variance:('*' | '+' | '!' | '-');

typeparametercharacteristics:'(' tpcharoption (',' tpcharoption)* ')';

tpcharoption:('==' | 'digits' | '!' 'new');

/*------------------------------------------------------------------------*/

methoddecl
:
 (
    'method'
    | 'lemma'
    | 'colemma'
    | 'comethod'
    | 'inductive' 'lemma'
    | 'twostate' 'lemma'
    | 'constructor'
 )
 (attribute)* (fume_ident)?
 (
    (genericparameters)? (ktype)? formals ('returns' formals)?
    | '...'
 )
 (methodspec)* (dividedblockstmt|blockstmt)?;

ktype
: '[' ( 'nat' | 'ordinal') ']';

methodspec
:
 (
     'modifies'( attribute)* frameexpression  (',' frameexpression)* oldsemi
     |('free')?
        (
            'requires' (attribute)* (labelident ':')? expression oldsemi
            | 'ensures'(attribute)* expression oldsemi
        )
     | 'decreases'( attribute)*decreaseslist oldsemi
 );

iteratorspec
:
 (
     'reads' ( attribute)* frameexpression (',' frameexpression)* oldsemi
     | 'modifies'( attribute)* frameexpression (',' frameexpression)* oldsemi
     |('free')? ('yield')?
     (
         'requires'
         (labelident ':')? expression oldsemi
         | 'ensures'( attribute)* expression oldsemi
     )
     | 'decreases'( attribute)*decreaseslist oldsemi
 );

formals:'(' (gidenttype (',' gidenttype)* )? ')';

formalsoptionalids:'(' (typeidentoptional (',' typeidentoptional)* )? ')';

/*------------------------------------------------------------------------*/

typeandtoken
:
 (
     'bool'
     | 'char'
     | 'int'
     | 'nat'
     | 'real'
     | 'ordinal'
     | 'bvtoken'
     | 'set' optgenericinstantiation
     | 'iset' optgenericinstantiation
     | 'multiset' optgenericinstantiation
     | 'seq' optgenericinstantiation
     | 'string'
     | 'object'
     | 'object?'
     | 'map'  optgenericinstantiation
     | 'imap'  optgenericinstantiation
     | 'arraytoken' optgenericinstantiation
     | 'arraytoken_q'  optgenericinstantiation
     | '(' (typeandtoken (',' typeandtoken)* )? ')'
     | namesegmentfortypename ('.' typenameorctorsuffix optgenericinstantiation)*
 )
 (('~>' | '-->' | '->' ) typeandtoken)?;

optgenericinstantiation:(genericinstantiation)?;

genericinstantiation:'<' typeandtoken ( ',' typeandtoken)*'>';

/*------------------------------------------------------------------------*/

functiondecl
:
 ('twostate')? (
     'function' ('method')? (attribute)* fume_ident
     (
         (genericparameters)? formals ':'
         (
             '(' gidenttype ')' | typeandtoken
         )
         | '...'
     )
     | 'predicate' ('method')? (attribute)* nousident
     (
         (genericparameters)? (formals)? (':')?
         | '...'
     )
     |
     'inductive' 'predicate' (attribute)* fume_ident
     (
         (genericparameters)? (ktype)? formals (':')?
         | '...'
     )
     |
     'copredicate' (attribute)* nousident
     (
         (genericparameters)? (ktype)? formals(':')?
         | '...'
     )
 ) (functionspec)* (functionbody)?;

functionspec
:
 (
     'requires' (attribute)* expression oldsemi
     | 'reads' possiblywildframeexpression (',' possiblywildframeexpression)* oldsemi
     | 'ensures' (attribute)* expression oldsemi
     | 'decreases' decreaseslist oldsemi
 );

possiblywildexpression
:
 ( '*'
 | expression
 );

possiblywildframeexpression:('*' | frameexpression);

frameexpression:(expression('`' ident)? | '`' ident);

functionbody:'{' expression '}';

/*------------------------------------------------------------------------*/

blockstmt:'{' (stmt)* '}';

dividedblockstmt:'{' (stmt)* ('new' ';' (stmt)* )? '}';

stmt:onestmt;

onestmt
:
 (
    blockstmt
     | assertstmt
     | assumestmt
     | printstmt
     | revealstmt
     | updatestmt
     | vardeclstatement
     | ifstmt
     | whilestmt
     | matchstmt
     | forallstmt
     | calcstmt
     | modifystmt
     | 'label' labelident ':' onestmt
     | 'break' ( labelident |('break')*) ';'
     | returnstmt
     | skeletonstmt
 );

skeletonstmt:'...' ('where' ident (',' ident)* ':=' expression (',' expression)*)? ';';

returnstmt:('return' | 'yield') (rhs (',' rhs)* )? ';';

updatestmt
:
 lhs
 (
     (attribute)* ';'
     | (',' lhs)* (
        ':=' rhs (',' rhs)*
        | ':|' ('assume')? expression
      )';'
     | ':'
 );

rhs
:
 (
     'new'
     (
         newarray
         | typeandtoken (newarray | '(' (expressions)? ')' )?
     )
     | '*'
     | expression
 )
 (attribute)*;

newarray
:
 '['
 (
     ']' '[' (expressions)? ']'
     | expressions ']' ('(' expression ')' | '[' (expressions)? ']' )?
 );

vardeclstatement
:
 ('ghost')? 'var'
 (
     (attribute)* localidenttypeoptional (',' (attribute)* localidenttypeoptional)*
     (
         ':=' rhs (',' rhs)* | (attribute)* ':|' ('assume')? expression
     )?
     ';'
     |
     casepatternlocal (':=' |(attribute)* ':|') expression ';'
 );

ifstmt
:
 'if'
 (
     alternativeblock
     |(
         existentialguard
         | guard
         | '...'
     ) blockstmt ('else'(ifstmt | blockstmt))?
 );

alternativeblock
:
 (
     '{' (alternativeblockcase)* '}'
     | alternativeblockcase (alternativeblockcase)*
 );

alternativeblockcase:'case' (existentialguard | expression) '=>' (stmt)*;

whilestmt
:
 'while'
 (
     (loopspec)* alternativeblock
     |
     (guard | '...')(loopspec)* (blockstmt | '...'|)
 );

loopspec
:
 (
     ('free')? 'invariant' (attribute)* expression oldsemi
     | 'decreases' (attribute)* decreaseslist oldsemi
     | 'modifies' ( attribute)* frameexpression (',' frameexpression)* oldsemi
 );

decreaseslist:possiblywildexpression (',' possiblywildexpression)*;

guard:( '*' | '(' '*' ')' | expression);

existentialguard:identtypeoptional (',' identtypeoptional)* (attribute)* ':|' expression;

matchstmt
:
 'match' expression
 (
     '{' (casestatement )* '}'
     | casestatement
 )*;

casestatement
:
 'case'
 (
    ident ('(' (casepattern (',' casepattern)* )? ')')?
    | '(' casepattern (',' casepattern )* ')'
 )
 '=>' (stmt)*;

assertstmt
:
 'assert'
 (attribute)*
 (
     (labelident ':')? expression ('by' blockstmt |';')
     | '...' ';'
 );

assumestmt:'assume' (attribute)* (expression | '...') ';';

printstmt:'print' expression (',' expression)* ';';

revealstmt:'reveal' expression (',' expression)* ';';

forallstmt
:
 ('forall' | 'parallel')
 ('('(quantifierdomain)?')'| (quantifierdomain)?)
 (('free')? 'ensures' expression oldsemi)* (blockstmt)?;

modifystmt
:
 'modify' (attribute)*
 (frameexpression (',' frameexpression)* | '...')
 (blockstmt | ';');

calcstmt
:
 'calc' ( attribute)* (calcop)? '{'
 (
     expression ';' (calcop)? (blockstmt| calcstmt)*
 )*
 '}';

calcop
:
 (
     '==' ('#' '[' expression ']')?
     | '\''
     | '='
     | '!='
     | '\u2260'
     | '\u2264'
     | '\u2265'
     | equivop
     | impliesop
     | expliesop
 );

equivop:'<==>' | '\u21d4';
impliesop:'==>' | '\u21d2';
expliesop:'<==' | '\u21d0';
andop:'&&' | '\u2227';
orop:'||' | '\u2228';

negop:'!' | '\u00ac';
forall:'forall' | '\u2200';
exists:'exists' | '\u2203';
qsep:'::' | '\u2022';

expression:equivexpression (';' expression)?;

/*------------------------------------------------------------------------*/

equivexpression:impliesexpliesexpression (equivop impliesexpliesexpression)*;

/*------------------------------------------------------------------------*/

impliesexpliesexpression
:
 logicalexpression
 (
     (
         impliesop impliesexpression
         | expliesop logicalexpression (expliesop logicalexpression)*
     )
 )?;

impliesexpression:logicalexpression (impliesop impliesexpression)?;

/*------------------------------------------------------------------------*/

logicalexpression
:
 (
     andop relationalexpression
     (andop relationalexpression)*
     | orop relationalexpression (orop relationalexpression)*
     | relationalexpression
     (
         (
             andop relationalexpression (andop relationalexpression)*
             | orop relationalexpression (orop relationalexpression)*
         )
     )?
 );

/*------------------------------------------------------------------------*/

relationalexpression
:
 shiftterm
 (
     relop shiftterm (relop shiftterm)*
 )?;

relop
:
 (
     '==' ('#' '[' expression ']')?
     | '<'
     | '>'
     | '<='
     | '>='
     | '!=' ('#' '[' expression ']')?
     | 'in'
     | 'notin'
     | '!' ('!')?
     | '\u2260'
     | '\u2264'
     | '\u2265'
 );

/*------------------------------------------------------------------------*/

shiftterm
:
 term
   (
     (
        '<' '<'
        | '>' '>'
     )
     term
   )*;

/*------------------------------------------------------------------------*/

term:factor (addop factor)*;

addop:('+' | '-');

/*------------------------------------------------------------------------*/

factor:bitvectorfactor (mulop bitvectorfactor)*;

mulop:('*'| '/'|'%');

/*------------------------------------------------------------------------*/

bitvectorfactor
:
 asexpression
 (
     (
         '&'  asexpression ( '&' asexpression)*
         | '|' asexpression ('|' asexpression )*
         | '^' asexpression ( '^' asexpression)*
    )
 )?;

/*------------------------------------------------------------------------*/

asexpression:unaryexpression ('as' typeandtoken)*;

unaryexpression
:
 (
     '-' unaryexpression
     | negop unaryexpression
     | 'map' mapdisplayexpr (suffix)*
     | 'imap' mapdisplayexpr (suffix)*
     | 'iset' isetdisplayexpr (suffix)*
     | lambdaexpression
     | endlessexpression
     | namesegment (suffix)*
     | displayexpr (suffix)*
     | multisetexpr (suffix)*
     | constatomexpression (suffix)*
 );

lhs
:
 (
     namesegment (suffix)*
     | constatomexpression suffix (suffix)*
 );

constatomexpression
:
 (
     'false'
     | 'true'
     | 'null'
     | nat
     | dec
     | 'chartoken'
     | 'stringtoken'
     | 'this'
     | 'fresh' '(' expression ')'
     | 'allocated' '(' expression ')'
     | 'unchanged' ('@' labelident)? '(' frameexpression (',' frameexpression)* ')'
     | 'old' ('@' labelident)? '(' expression ')'
     | '|'  expression '|'
     | ( 'int' | 'real') '(' expression ')'
     | parensexpression
 );

lambdaarrow:'=>';

lambdaexpression
:
 (
     wildident
     | '(' ( identtypeoptional (',' identtypeoptional)* )? ')'
 )
 (
     'reads' possiblywildframeexpression (',' possiblywildframeexpression)*
     | 'requires' expression
 )*
 lambdaarrow expression;

parensexpression: '(' (expressions)? ')';

isetdisplayexpr:'{' (expressions)? '}';

displayexpr
:
 (
     '{' (expressions)? '}'
     | '[' (expressions)? ']'
 );

multisetexpr
:
 'multiset'
 (
     '{'  (expressions)? '}'
     | '(' expression ')'
 );

mapdisplayexpr:'[' (mapliteralexpressions)? ']';

mapliteralexpressions:expression ':=' expression (',' expression ':=' expression)*;

mapcomprehensionexpr
:
    identtypeoptional (',' identtypeoptional )*
    (attribute)* ('|' expression)? qsep
    expression ( ':=' expression)?;

endlessexpression
:
 (
     'if' (existentialguard | expression) 'then' expression 'else' expression
     | matchexpression
     | quantifierguts
     | 'set' setcomprehensionexpr
     | 'iset' setcomprehensionexpr
     | stmtinexpr expression
     | letexpr
     | 'map'  mapcomprehensionexpr
     | 'imap' mapcomprehensionexpr
     | 'reveal' expression
     | namedexpr
 );

stmtinexpr:(assertstmt | assumestmt | calcstmt);

letexpr
:
 ('ghost')? 'var' casepattern (',' casepattern)*
 (
    ':=' |(attribute)* ':|'
 )
 expression (',' expression )* ';' expression;

namedexpr:'label' nousident ':' expression;

matchexpression
:
 'match' expression
 (
     '{' (caseexpression)* '}'
     | (caseexpression)*
 );

caseexpression
:
 'case' (
    ident ('(' (casepattern (',' casepattern)*)? ')')?
     | '('  casepattern (',' casepattern)* ')'
 )
 '=>' expression;

casepattern
:
 (
     ident '(' (casepattern (',' casepattern)* )? ')'
     | '(' (casepattern (',' casepattern)* )? ')'
     | identtypeoptional
 );

casepatternlocal
:
 (
     ident  '(' (casepatternlocal (',' casepatternlocal)* )? ')'
     | '(' (casepatternlocal (',' casepatternlocal)* )? ')'
     | localidenttypeoptional
 );

/*------------------------------------------------------------------------*/

namesegment:ident (genericinstantiation|hashcall|);

namesegmentfortypename: ident optgenericinstantiation;

hashcall:'#' (genericinstantiation)? '[' expression ']' '(' (expressions)? ')';

suffix
:
 (
     '.'
     (
         '(' memberbindingupdate (',' memberbindingupdate)* ')'
         | dotsuffix (genericinstantiation|hashcall|)
     )
     | '['
     (
         expression
         (
             '..'(expression)?
             | ':=' expression
             | ':' (expression ( ':' expression)* (':')? )?
             | (',' expression)*
         )
         | '..'
         (expression)?
     )
     ']'
     | '('
     (expressions)? ')'
 );

/*------------------------------------------------------------------------*/

quantifierguts:(forall | exists) quantifierdomain qsep expression;

quantifierdomain:identtypeoptional (',' identtypeoptional)* (attribute)* ('|'expression)?;

setcomprehensionexpr
:
 identtypeoptional (',' identtypeoptional)*
 (attribute)* '|' expression (qsep expression)?;

expressions:expression (',' expression)*;

/*------------------------------------------------------------------------*/

attribute:'{' ':' nousident (expressions)? '}';

/*------------------------------------------------------------------------*/

ident: 'identdef';

dotsuffix
:
 (
     'identdef'
     | 'digits'
     | 'decimaldigits'
     | 'requires'
     | 'reads'
 );

memberbindingupdate:('identdef' | 'digits') ':=' expression;

labelident:(nousident | 'digits');

fume_ident:(nousident | 'digits');

typenameorctorsuffix:('identdef' | 'digits');

nousident:'identdef';

wildident:'identdef';

oldsemi:';';

nat:( 'digits' | 'hexdigits');

dec:('decimaldigits');

