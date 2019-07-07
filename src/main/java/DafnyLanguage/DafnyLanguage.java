package DafnyLanguage;

import com.intellij.lang.Language;

import static DafnyCommunication.DafnyPluginStrings.DAFNY;

public class DafnyLanguage extends Language {

    public static final DafnyLanguage INSTANCE = new DafnyLanguage();

    protected DafnyLanguage() {
        super(DAFNY);
    }
}
