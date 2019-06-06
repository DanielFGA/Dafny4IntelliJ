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
        return new DafnyConfigurationController().getConfigurationPanel();
    }

    @Override
    public void updateDataModel() {
        //No Implementation needed, because validate() saves the data automatically, if the data is valid.
    }

    /**
     * Validates user input before {@link #updateDataModel()} is called.
     * For the validation the path for the Dafny files is tested.
     * @return {@code true} if input is valid, {@code false} otherwise
     */
    @Override
    public boolean validate()  throws ConfigurationException {
        return dafnyConfigurationController.validate();
    }
}
