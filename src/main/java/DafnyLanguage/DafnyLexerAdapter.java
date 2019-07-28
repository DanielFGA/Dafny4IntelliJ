package DafnyLanguage;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Adapter for the Dafny lexer.
 */
public class DafnyLexerAdapter extends FlexAdapter {

    /**
     * Constructor.
     */
    public DafnyLexerAdapter() {
        super(new _DafnyLexer((Reader) null));
    }
}
