package DafnyGUI.DafnyProjectWizard;

import Dafny.DafnyPluginStrings;
import DafnyLanguage.DafnyIcon;
import com.intellij.openapi.module.ModuleType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DafnyModuleType extends ModuleType<DafnyModuleBuilder> {

    private static final DafnyModuleType INSTANCE = new DafnyModuleType();

    public DafnyModuleType() {
        super(DafnyPluginStrings.DAFNY_MODULE);
    }

    @NotNull
    @Override
    public DafnyModuleBuilder createModuleBuilder() {
        return new DafnyModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return DafnyPluginStrings.DAFNY;
    }

    @NotNull
    @Override
    public String getDescription() {
        return DafnyPluginStrings.DAFNY_MODULE_DESCRIPTION;
    }

    @Override
    public Icon getNodeIcon(boolean isOpened) {
        return DafnyIcon.FILE;
    }

    public static DafnyModuleType getInstance() {
        return INSTANCE;
    }



}
