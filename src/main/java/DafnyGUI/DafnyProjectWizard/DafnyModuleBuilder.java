package DafnyGUI.DafnyProjectWizard;

import DafnyGUI.DafnyUI.DafnyConfigurationWindowView;
import com.intellij.ide.util.projectWizard.*;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DafnyModuleBuilder extends ModuleBuilder implements SourcePathsBuilder  {

    private DafnyModuleType dafnyModuleType;
    private List<Pair<String, String>> srcPaths;
    private DafnyConfigurationWindowView dafnyConfigurationWindowView;
    private DafnyModuleWizardStep dafnyModuleWizardStep;

    public DafnyModuleBuilder() {
        dafnyModuleType = DafnyModuleType.getInstance();
        dafnyConfigurationWindowView = new DafnyConfigurationWindowView();
        dafnyModuleWizardStep = new DafnyModuleWizardStep(this);
    }

    @Override
    public void setupRootModel(ModifiableRootModel modifiableRootModel) throws ConfigurationException {
        ContentEntry contentEntry = doAddContentEntry(modifiableRootModel);
        if (contentEntry != null) {
            final List<Pair<String,String>> sourcePaths = getSourcePaths();

            if (sourcePaths != null) {
                for (final Pair<String, String> sourcePath : sourcePaths) {
                    String first = sourcePath.first;
                    new File(first).mkdirs();
                    final VirtualFile sourceRoot = LocalFileSystem.getInstance()
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
        return dafnyModuleType;
    }


    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{dafnyModuleWizardStep};
    }

    @Override
    public List<Pair<String, String>> getSourcePaths() throws ConfigurationException {
        if (srcPaths == null) {
            final List<Pair<String, String>> paths = new ArrayList<>();
            final String path = getContentEntryPath() + File.separator + "src";
            new File(path).mkdirs();
            paths.add(Pair.create(path, ""));
            return paths;
        }
        return srcPaths;
    }

    @Override
    public void setSourcePaths(List<Pair<String, String>> sourcePaths) {
        srcPaths = sourcePaths != null ? new ArrayList<>(sourcePaths) : null;
    }

    @Override
    public void addSourcePath(Pair<String, String> sourcePathInfo) {
        if (srcPaths == null) {
            srcPaths = new ArrayList<>();
        }
        srcPaths.add(sourcePathInfo);
    }

    public JPanel getConfigurationPanel() {
        return dafnyConfigurationWindowView.getConfigurationPanel();
    }
}
