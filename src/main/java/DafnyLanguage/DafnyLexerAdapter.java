package DafnyLanguage;

import Lexer.DafnyLexer;
import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class DafnyLexerAdapter extends FlexAdapter {

    public DafnyLexerAdapter() {
        super(new DafnyLexer((Reader) null));
    }
}
