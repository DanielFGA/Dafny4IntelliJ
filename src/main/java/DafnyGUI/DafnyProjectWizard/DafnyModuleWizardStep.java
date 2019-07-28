package DafnyGUI.DafnyProjectWizard;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.openapi.options.ConfigurationException;

import javax.swing.*;

/**
 * Represent a wizard step in the project wizard.
 */
public class DafnyModuleWizardStep extends ModuleWizardStep {

    /**
     * The DafnyConfigurationController represent the wizard step.
     */
    private DafnyConfigurationController dafnyConfigurationController;

    /**
     * Constructor
     */
    public DafnyModuleWizardStep() {
        dafnyConfigurationController = new DafnyConfigurationController();
    }

    /**
     * Create visual UI for the wizard step.
     *
     * @return the UI (Swing) for the wizard step.
     */
    @Override
    public JComponent getComponent() {
        return dafnyConfigurationController.getConfigurationPanel();
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
