package DafnyGUI.DafnyProjectWizard;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;

import javax.swing.*;

public class DafnyModuleWizardStep extends ModuleWizardStep {

    private DafnyModuleBuilder dafnyModuleBuilder;

    public DafnyModuleWizardStep(DafnyModuleBuilder dafnyModuleBuilder) {
        this.dafnyModuleBuilder = dafnyModuleBuilder;
    }

    @Override
    public JComponent getComponent() {
        return dafnyModuleBuilder.getConfigurationPanel();
    }

    @Override
    public void updateDataModel() {
        //TODO ??
    }
}
