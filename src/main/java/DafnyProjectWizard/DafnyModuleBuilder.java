package DafnyProjectWizard;

import DafnyGUI.DafnyWizardWindow;
import DafnyLanguage.DafnyIcon;
import com.intellij.ide.util.projectWizard.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class DafnyModuleBuilder extends JavaModuleBuilder implements SourcePathsBuilder, ModuleBuilderListener  {

    @Override
    public void setupRootModel(ModifiableRootModel modifiableRootModel) throws ConfigurationException {
        addListener(this);
        super.setupRootModel(modifiableRootModel);
    }

    @NotNull
    @Override
    public ModuleType getModuleType() {
        return DafnyModuleType.getInstance();
    }


    @Override
    public void moduleCreated(@NotNull Module module) {

    }

    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{new ModuleWizardStep() {
            @Override
            public JComponent getComponent() {
                JPanel wizardPanel = new JPanel();
                wizardPanel.setLayout(new GridLayout());
                JLabel header = new JLabel("Path to Dafny-Files/Language Server");
                wizardPanel.add(header);
                wizardPanel.add(new JButton("hey1"));
                wizardPanel.add(new JButton("hey2"));
                return new DafnyWizardWindow().getPane();
            }

            @Override
            public void updateDataModel() {

            }
        }};
    }
}
