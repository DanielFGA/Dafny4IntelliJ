package DafnyLanguage;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Creates the Dafny syntax highlighter.
 */
public class DafnySyntaxHighlighterFactory extends SyntaxHighlighterFactory {
    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        DafnySyntaxHighlighter dafnySyntaxHighlighter = new DafnySyntaxHighlighter();
        dafnySyntaxHighlighter.registerKeyWords();
        return dafnySyntaxHighlighter;
    }
}
