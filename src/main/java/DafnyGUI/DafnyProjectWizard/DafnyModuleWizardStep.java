package DafnyGUI.DafnyProjectWizard;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.openapi.options.ConfigurationException;

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

    /**
     * Validates user input before {@link #updateDataModel()} is called.
     * For the validation the path for the Dafny files is tested.
     * @return {@code true} if input is valid, {@code false} otherwise
     */
    @Override
    public boolean validate() {
        dafnyConfigurationController.savePathAndOS();
        return dafnyConfigurationController.testPath();
    }
}
