package DafnyLanguage;

import DafnyLanguage.psi.impl.DafnyTypeImpl;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class DafnySyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey DAFNY_KEY =
            createTextAttributesKey("DAFNY_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VAR_KEY =
            createTextAttributesKey("VAR_KEY", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey VERIFY_KEY =
            createTextAttributesKey("VERIFY_KEY", DefaultLanguageHighlighterColors.CLASS_REFERENCE);
    public static final TextAttributesKey STRING_CHAR_KEY =
            createTextAttributesKey("STRING_CHAR_KEY", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey DIGIT_KEY =
            createTextAttributesKey("DIGIT_KEY", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey SYMBOL_KEY =
            createTextAttributesKey("SYMBOL_KEY", DefaultLanguageHighlighterColors.MARKUP_TAG);
    public static final TextAttributesKey COMMENT_KEY =
            createTextAttributesKey("COMMENT_KEY", DefaultLanguageHighlighterColors.LINE_COMMENT);

    private static final TextAttributesKey[] DAFNY_KEYS = new TextAttributesKey[]{DAFNY_KEY};
    private static final TextAttributesKey[] VAR_KEYS = new TextAttributesKey[]{VAR_KEY};
    private static final TextAttributesKey[] VERIFY_KEYS = new TextAttributesKey[]{VERIFY_KEY};
    private static final TextAttributesKey[] STRING_CHAR_KEYS = new TextAttributesKey[]{STRING_CHAR_KEY};
    private static final TextAttributesKey[] DIGIT_KEYS = new TextAttributesKey[]{DIGIT_KEY};
    private static final TextAttributesKey[] SYMBOL_KEYS = new TextAttributesKey[]{SYMBOL_KEY};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT_KEY};

    private Set<IElementType> DAFNY_KEY_SET = new HashSet<>();
    private Set<IElementType> VAR_KEY_SET = new HashSet<>();
    private Set<IElementType> VERIFY_KEY_SET = new HashSet<>();
    private Set<IElementType> STRING_CHAR_KEY_SET = new HashSet<>();
    private Set<IElementType> DIGIT_KEY_SET = new HashSet<>();
    private Set<IElementType> SYMBOL_KEY_SET = new HashSet<>();

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new DafnyLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType iElementType) {

        if (DAFNY_KEY_SET.contains(iElementType)) return DAFNY_KEYS;
        if (VAR_KEY_SET.contains(iElementType)) return VAR_KEYS;
        if (VERIFY_KEY_SET.contains(iElementType)) return VERIFY_KEYS;
        if (STRING_CHAR_KEY_SET.contains(iElementType)) return STRING_CHAR_KEYS;
        if (DIGIT_KEY_SET.contains(iElementType)) return DIGIT_KEYS;
        if (SYMBOL_KEY_SET.contains(iElementType)) return SYMBOL_KEYS;
        if (iElementType.equals(DafnyTypeImpl.COMMENT)) return COMMENT_KEYS;
        return new TextAttributesKey[0];
    }

    protected void registerKeyWords() {

        VAR_KEY_SET.add(DafnyTypeImpl.BOOL);
        VAR_KEY_SET.add(DafnyTypeImpl.CHAR);
        VAR_KEY_SET.add(DafnyTypeImpl.INT);
        VAR_KEY_SET.add(DafnyTypeImpl.STRING);
        VAR_KEY_SET.add(DafnyTypeImpl.SET);
        VAR_KEY_SET.add(DafnyTypeImpl.ISET);
        VAR_KEY_SET.add(DafnyTypeImpl.MULTISET);
        VAR_KEY_SET.add(DafnyTypeImpl.SEQ);
        VAR_KEY_SET.add(DafnyTypeImpl.MAP);
        VAR_KEY_SET.add(DafnyTypeImpl.IMAP);
        VAR_KEY_SET.add(DafnyTypeImpl.NATTOKEN);
        VAR_KEY_SET.add(DafnyTypeImpl.REAL);
        VAR_KEY_SET.add(DafnyTypeImpl.ORDINAL);
        VAR_KEY_SET.add(DafnyTypeImpl.OBJECT);
        VAR_KEY_SET.add(DafnyTypeImpl.BVTOKEN);
        VAR_KEY_SET.add(DafnyTypeImpl.ARRAYTOKEN);
        VAR_KEY_SET.add(DafnyTypeImpl.ARRAYTOKEN_Q);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.COLON);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.COMMA);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.VERTICALBAR);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.DOUBLECOLON);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.GETS);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.BOREDSMILEY);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.BULLET);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.DOT);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.BACKTICK);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.SEMI);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.DARROW);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.LBRACE);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.RBRACE);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.LBRACKET);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.RBRACKET);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.OPENPAREN);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.CLOSEPAREN);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.EQ);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.NEQ);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.NEQALT);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.STAR);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.ELLIPSIS);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.REVEAL);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.OPENANGLEBRACKET);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.CLOSEANGLEBRACKET);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.PLUS);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.MINUS);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.ASSIGN);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.BOOLAND);
        SYMBOL_KEY_SET.add(DafnyTypeImpl.BOOLOR);
        DAFNY_KEY_SET.add(DafnyTypeImpl.CALC);
        DAFNY_KEY_SET.add(DafnyTypeImpl.CASE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.THEN);
        DAFNY_KEY_SET.add(DafnyTypeImpl.ELSE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.AS);
        DAFNY_KEY_SET.add(DafnyTypeImpl.BY);
        DAFNY_KEY_SET.add(DafnyTypeImpl.IN);
        DAFNY_KEY_SET.add(DafnyTypeImpl.OBJECT_Q);
        DAFNY_KEY_SET.add(DafnyTypeImpl.FUNCTION);
        DAFNY_KEY_SET.add(DafnyTypeImpl.PREDICATE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.INDUCTIVE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.TWOSTATE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.COPREDICATE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.LEMMA);
        DAFNY_KEY_SET.add(DafnyTypeImpl.STATIC);
        DAFNY_KEY_SET.add(DafnyTypeImpl.PROTECTED);
        DAFNY_KEY_SET.add(DafnyTypeImpl.IMPORT);
        DAFNY_KEY_SET.add(DafnyTypeImpl.EXPORT);
        DAFNY_KEY_SET.add(DafnyTypeImpl.CLASSTOKEN);
        DAFNY_KEY_SET.add(DafnyTypeImpl.TRAIT);
        DAFNY_KEY_SET.add(DafnyTypeImpl.DATATYPE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.CODATATYPE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.VAR);
        DAFNY_KEY_SET.add(DafnyTypeImpl.CONST);
        DAFNY_KEY_SET.add(DafnyTypeImpl.NEWTYPE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.TYPE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.ITERATOR);
        DAFNY_KEY_SET.add(DafnyTypeImpl.METHOD);
        DAFNY_KEY_SET.add(DafnyTypeImpl.COLEMMA);
        DAFNY_KEY_SET.add(DafnyTypeImpl.CONSTRUCTOR);
        DAFNY_KEY_SET.add(DafnyTypeImpl.GHOST);
        DAFNY_KEY_SET.add(DafnyTypeImpl.WITNESS);
        DAFNY_KEY_SET.add(DafnyTypeImpl.INCLUDE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.ABSTRACT);
        DAFNY_KEY_SET.add(DafnyTypeImpl.MODULE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.REFINES);
        DAFNY_KEY_SET.add(DafnyTypeImpl.PROVIDES);
        DAFNY_KEY_SET.add(DafnyTypeImpl.REVEALS);
        DAFNY_KEY_SET.add(DafnyTypeImpl.EXTENDS);
        DAFNY_KEY_SET.add(DafnyTypeImpl.YIELDS);
        DAFNY_KEY_SET.add(DafnyTypeImpl.RETURNS);
        DAFNY_KEY_SET.add(DafnyTypeImpl.NEW);
        DAFNY_KEY_SET.add(DafnyTypeImpl.COMETHOD);
        DAFNY_KEY_SET.add(DafnyTypeImpl.FREE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.LABEL);
        DAFNY_KEY_SET.add(DafnyTypeImpl.BREAK);
        DAFNY_KEY_SET.add(DafnyTypeImpl.IF);
        DAFNY_KEY_SET.add(DafnyTypeImpl.WHILE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.MATCH);
        DAFNY_KEY_SET.add(DafnyTypeImpl.PRINT);
        DAFNY_KEY_SET.add(DafnyTypeImpl.OPENED);
        DAFNY_KEY_SET.add(DafnyTypeImpl.GHOST);
        DAFNY_KEY_SET.add(DafnyTypeImpl.YIELD);
        DAFNY_KEY_SET.add(DafnyTypeImpl.WHERE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.RETURN);
        DAFNY_KEY_SET.add(DafnyTypeImpl.PARALLEL);
        DAFNY_KEY_SET.add(DafnyTypeImpl.FALSE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.TRUE);
        DAFNY_KEY_SET.add(DafnyTypeImpl.NULL);
        DAFNY_KEY_SET.add(DafnyTypeImpl.THIS);
        DAFNY_KEY_SET.add(DafnyTypeImpl.FRESH);
        DAFNY_KEY_SET.add(DafnyTypeImpl.ALLOCATED);
        DAFNY_KEY_SET.add(DafnyTypeImpl.UNCHANGED);
        VERIFY_KEY_SET.add(DafnyTypeImpl.ASSUME);
        VERIFY_KEY_SET.add(DafnyTypeImpl.DECREASES);
        VERIFY_KEY_SET.add(DafnyTypeImpl.INVARIANT);
        VERIFY_KEY_SET.add(DafnyTypeImpl.MODIFIES);
        VERIFY_KEY_SET.add(DafnyTypeImpl.READS);
        VERIFY_KEY_SET.add(DafnyTypeImpl.REQUIRES);
        VERIFY_KEY_SET.add(DafnyTypeImpl.ENSURES);
        VERIFY_KEY_SET.add(DafnyTypeImpl.FORALLTOKEN);
        VERIFY_KEY_SET.add(DafnyTypeImpl.ASSERT);
        VERIFY_KEY_SET.add(DafnyTypeImpl.MODIFY);
        VERIFY_KEY_SET.add(DafnyTypeImpl.OLD);
        VERIFY_KEY_SET.add(DafnyTypeImpl.EXISTSTOKEN);
        VERIFY_KEY_SET.add(DafnyTypeImpl.NOTIN);
        STRING_CHAR_KEY_SET.add(DafnyTypeImpl.CHARTOKEN);
        STRING_CHAR_KEY_SET.add(DafnyTypeImpl.STRINGTOKEN);
        DIGIT_KEY_SET.add(DafnyTypeImpl.DIGITS);
        DIGIT_KEY_SET.add(DafnyTypeImpl.HEXDIGITS);
        DIGIT_KEY_SET.add(DafnyTypeImpl.DECIMALDIGITS);
    }
}
