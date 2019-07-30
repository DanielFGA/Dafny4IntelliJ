package DafnyGUI.DafnyProjectWizard;

import DafnyCommunication.DafnyPluginStrings;
import DafnyLanguage.DafnyIcon;
import com.intellij.openapi.module.ModuleType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Represent the module type Dafny.
 */
public class DafnyModuleType extends ModuleType<DafnyModuleBuilder> {

    /**
     * Instance of the DafnyModuleType
     */
    private static final DafnyModuleType INSTANCE = new DafnyModuleType();

    /**
     * Constructor.
     */
    public DafnyModuleType() {
        super(DafnyPluginStrings.DAFNY_MODULE);
    }

    /**
     * Creates the module builder for Dafny.
     *
     * @return A new DafnyModuleBuilder.
     */
    @NotNull
    @Override
    public DafnyModuleBuilder createModuleBuilder() {
        return new DafnyModuleBuilder();
    }

    /**
     * Getter for the module name.
     * @return the module name.
     */
    @NotNull
    @Override
    public String getName() {
        return DafnyPluginStrings.DAFNY;
    }

    /**
     * Getter for the module description.
     * @return the description for the module.
     */
    @NotNull
    @Override
    public String getDescription() {
        return DafnyPluginStrings.DAFNY_MODULE_DESCRIPTION;
    }

    /**
     * Getter for the module icon.
     * @return the Dafny icon.
     */
    @Override
    public Icon getNodeIcon(boolean isOpened) {
        return DafnyIcon.FILE;
    }

    /**
     * Getter for the DafnyModuleType instance.
     * @return the DafnyModuleType instance.
     */
    public static DafnyModuleType getInstance() {
        return INSTANCE;
    }


}
