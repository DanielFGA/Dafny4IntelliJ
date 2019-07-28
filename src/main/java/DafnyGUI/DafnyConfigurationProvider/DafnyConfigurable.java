package DafnyGUI.DafnyConfigurationProvider;

import DafnyCommunication.DafnyPluginStrings;
import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * DafnyConfigurable creates the configuration window in the IntelliJ settings. It implements the Configurable.
 */
public class DafnyConfigurable implements Configurable  {

    /**
     * The DafnyConfigurationController represent the configuration window.
     */
    private DafnyConfigurationController dafnyConfigurationController;

    /**
     * Constructor. Initializes DafnyConfigurationController.
     */
    public DafnyConfigurable() {
        dafnyConfigurationController = new DafnyConfigurationController();
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return DafnyPluginStrings.DAFNY;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return dafnyConfigurationController.getConfigurationPanel();
    }

    /**
     * Checks if the settings have been changed.
     * @return always true, because the user could click on "Apply" everytime, even there are no modifications.
     */
    @Override
    public boolean isModified() {
        //It is always true, so the user could click on "Apply" everytime, even there are no modifications.
        return true;
    }

    /**
     * Check the configuration and save.
     * @throws ConfigurationException if configuration is invalid.
     */
    @Override
    public void apply() throws ConfigurationException {
        dafnyConfigurationController.validate();
    }

    /**
     * Set settings back to the last valid settings.
     */
    @Override
    public void reset() {
        dafnyConfigurationController.reset();
    }



}
