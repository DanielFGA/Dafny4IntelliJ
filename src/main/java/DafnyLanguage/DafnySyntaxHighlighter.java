package DafnyLanguage;

import DafnyLanguage.psi.DafnyImpliesExpliesExpression;
import DafnyLanguage.psi.impl.DafnyTypeImpl;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class DafnySyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEY =
            createTextAttributesKey("DAFNY_KEY", DefaultLanguageHighlighterColors.KEYWORD);

    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new DafnyLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType iElementType) {
        if (iElementType.equals(DafnyTypeImpl.METHOD)) return KEY_KEYS;
        if (iElementType.equals(DafnyTypeImpl.IDENTDEF)) return KEY_KEYS;
        return new TextAttributesKey[0];
    }
}
