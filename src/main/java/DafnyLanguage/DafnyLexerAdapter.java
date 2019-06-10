package DafnyLanguage;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class DafnyLexerAdapter extends FlexAdapter {

    public DafnyLexerAdapter() {
        super(new _DafnyLexer((Reader) null));
    }
}
