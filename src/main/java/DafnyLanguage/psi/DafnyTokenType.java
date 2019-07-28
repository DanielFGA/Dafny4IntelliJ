package DafnyLanguage.psi;

import DafnyLanguage.DafnyLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * Represent a Dafny token.
 */
public class DafnyTokenType extends IElementType {

    /**
     * Constructor.
     */
    public DafnyTokenType(@NotNull String debugName) {
        super(debugName, DafnyLanguage.INSTANCE);
    }

    /**
     * String representation of the Dafny token.
     *
     * @return
     */
    @Override
    public String toString() {
        return "DafnyTokenType." + super.toString();
    }
}
