package DafnyLanguage;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class DafnyLanguage extends Language {

    public static final DafnyLanguage INSTANCE = new DafnyLanguage();

    protected DafnyLanguage() {
        super("Dafny");
    }
}
