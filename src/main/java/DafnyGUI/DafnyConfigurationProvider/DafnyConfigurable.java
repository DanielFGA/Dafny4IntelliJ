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
     * Constructor.
     */
    public DafnyConfigurable() {
        dafnyConfigurationController = new DafnyConfigurationController();
    }

    /**
     * Getter for the name that is displayed.
     *
     * @return the name that is displayed.
     */
    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return DafnyPluginStrings.DAFNY;
    }

    /**
     * Create visual UI for the configuration window.
     * @return the UI (Swing) for the configuration window.
     */
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
     * Check the settings and save.
     * @throws ConfigurationException if settings aren't valid.
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
