package DafnyLanguage;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

import static DafnyCommunication.DafnyPluginStrings.*;

/**
 * Represent a Dafny file type.
 */
public class DafnyFileType extends LanguageFileType{

    /**
     * The instance of the Dafny file type.
     */
    public static final DafnyFileType INSTANCE = new DafnyFileType();

    /**
     * Constructor.
     */
    protected DafnyFileType() {
        super(DafnyLanguage.INSTANCE);
    }

    /**
     * Getter for the file type name.
     *
     * @return the file type name.
     */
    @NotNull
    @Override
    public String getName() {
        return FILE_TYPE;
    }

    /**
     * Getter for the file type description.
     * @return the file type description.
     */
    @NotNull
    @Override
    public String getDescription() {
        return FILE_TYPE_DESCRIPTION;
    }

    /**
     * Getter for the file type default extension.
     * @return the file type default extension.
     */
    @NotNull
    @Override
    public String getDefaultExtension() {
        return DAFNY_FILE_ABBR;
    }

    /**
     * Getter for the file type icon.
     * @return the file type icon
     */
    @Nullable
    @Override
    public Icon getIcon() {
        return DafnyIcon.FILE;
    }
}
