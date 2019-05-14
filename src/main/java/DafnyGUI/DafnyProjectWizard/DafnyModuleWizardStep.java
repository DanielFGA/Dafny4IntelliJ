package DafnyGUI.DafnyProjectWizard;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;

import javax.swing.*;

public class DafnyModuleWizardStep extends ModuleWizardStep {

    private DafnyConfigurationController dafnyConfigurationController;

    public DafnyModuleWizardStep() {
        dafnyConfigurationController = new DafnyConfigurationController();
    }

    @Override
    public JComponent getComponent() {
        return dafnyConfigurationController.getConfigurationPanel();
    }

    @Override
    public void updateDataModel() {
        //TODO ??
    }
}
