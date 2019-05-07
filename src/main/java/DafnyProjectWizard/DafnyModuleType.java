package DafnyProjectWizard;

import DafnyLanguage.DafnyIcon;
import com.intellij.openapi.module.ModuleType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DafnyModuleType extends ModuleType<DafnyModuleBuilder> {

    private static final DafnyModuleType INSTANCE = new DafnyModuleType();
    private static final String ID = "DAFNY_MODULE";

    public DafnyModuleType() {
        super(ID);
    }

    @NotNull
    @Override
    public DafnyModuleBuilder createModuleBuilder() {
        return new DafnyModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return "Dafny";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Add support for Dafny";
    }

    @Override
    public Icon getNodeIcon(boolean isOpened) {
        return DafnyIcon.FILE;
    }

    public static DafnyModuleType getInstance() {
        return INSTANCE;
    }



}
