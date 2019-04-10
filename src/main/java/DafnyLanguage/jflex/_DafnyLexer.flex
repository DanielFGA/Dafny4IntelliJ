package DafnyLanguage.jflex;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static DafnyLanguage.psi.DafnyType.*;

%%

%{
  public _DafnyLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class DafnyLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENT=[a-zA-Z'_?\"][a-zA-Z'_?\"0-9]*
DIGITS=[0-9]+
STRING=\"[a-zA-Z0-9 `~!@#$%\^&*()-_=+[{]}|;:',<.>"/"?\\]*\"

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "EOF"              { return EOF; }

  {IDENT}            { return IDENT; }
  {DIGITS}           { return DIGITS; }
  {STRING}           { return STRING; }

}

[^] { return BAD_CHARACTER; }
