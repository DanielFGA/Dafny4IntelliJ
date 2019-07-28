package DafnyGUI.DafnyProjectWizard;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.io.File;

import static DafnyCommunication.DafnyPluginStrings.DAFNY_MODULE_SRC_DIR_NAME;

/**
 * The Module Builder for Dafny.
 */
public class DafnyModuleBuilder extends ModuleBuilder {

    /**
     * Create root model. The root of a Dafny module contains a source directory.
     */
    @Override
    public void setupRootModel(@NotNull ModifiableRootModel modifiableRootModel) {
        //Create root folder for new module
        ContentEntry contentEntry = doAddContentEntry(modifiableRootModel);
        if (contentEntry != null) {

            //Create new folder
            String srcPath = getContentEntryPath() + File.separator + DAFNY_MODULE_SRC_DIR_NAME;
            new File(srcPath).mkdirs();

            VirtualFile sourceRoot = LocalFileSystem.getInstance()
                    .refreshAndFindFileByPath(FileUtil.toSystemIndependentName(srcPath));
            if (sourceRoot != null) {
                //add new folder as source folder
                contentEntry.addSourceFolder(sourceRoot, false);
            }

        }
    }

    /**
     * Getter for the DafnyModuleType.
     *
     * @return the instance of the DafnyModuleType.
     */
    @NotNull
    @Override
    public ModuleType getModuleType() {
        return DafnyModuleType.getInstance();
    }

    /**
     * Creates wizard steps for the module builder. There is only one wizard step.
     */
    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{new DafnyModuleWizardStep()};
    }

}
