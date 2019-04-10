package DafnyLanguage.psi;

import DafnyLanguage.DafnyLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DafnyTokenType extends IElementType {

    public DafnyTokenType(@NotNull String debugName) {
        super(debugName, DafnyLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "DafnyTokenType." + super.toString();
    }
}
