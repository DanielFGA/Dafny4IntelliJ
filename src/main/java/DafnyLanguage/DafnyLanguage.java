package DafnyLanguage;

import com.intellij.lang.Language;

import static DafnyCommunication.DafnyPluginStrings.DAFNY;

/**
 * Represent Dafny as a language.
 */
public class DafnyLanguage extends Language {

    /**
     * Instance of the Dafny language.
     */
    public static final DafnyLanguage INSTANCE = new DafnyLanguage();

    /**
     * Constructor.
     */
    protected DafnyLanguage() {
        super(DAFNY);
    }
}
