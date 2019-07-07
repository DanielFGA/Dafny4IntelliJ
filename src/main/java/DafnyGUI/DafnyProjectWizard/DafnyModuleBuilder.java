package DafnyGUI.DafnyProjectWizard;

import DafnyCommunication.DafnyPluginStrings;
import com.intellij.ide.util.projectWizard.*;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DafnyModuleBuilder extends ModuleBuilder {

    @Override
    public void setupRootModel(@NotNull ModifiableRootModel modifiableRootModel) {
        ContentEntry contentEntry = doAddContentEntry(modifiableRootModel);
        if (contentEntry != null) {
            List<Pair<String, String>> sourcePaths = new ArrayList<>();
            String srcPath = getContentEntryPath() + File.separator + DafnyPluginStrings.DAFNY_MODULE_SRC_DIR_NAME;
            //new File(srcPath).mkdirs();
            sourcePaths.add(Pair.create(srcPath, ""));
            if (sourcePaths != null) {
                for (Pair<String, String> sourcePath : sourcePaths) {
                    String first = sourcePath.first;
                    new File(first).mkdirs();
                    VirtualFile sourceRoot = LocalFileSystem.getInstance()
                            .refreshAndFindFileByPath(FileUtil.toSystemIndependentName(first));
                    if (sourceRoot != null) {
                        contentEntry.addSourceFolder(sourceRoot, false, sourcePath.second);
                    }
                }
            }
        }
    }

    @NotNull
    @Override
    public ModuleType getModuleType() {
        return DafnyModuleType.getInstance();
    }


    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{new DafnyModuleWizardStep()};
    }

}
