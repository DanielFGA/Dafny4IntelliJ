package DafnyLanguage;

import DafnyLanguage.jflex.DafnyLexer;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

public class DafnyLexerAdapter extends FlexAdapter {

    public DafnyLexerAdapter() {
        super(new DafnyLexer((Reader) null));
    }
}
