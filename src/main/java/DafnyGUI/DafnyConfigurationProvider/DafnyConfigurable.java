package DafnyGUI.DafnyConfigurationProvider;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import DafnyGUI.DafnyPluginStrings;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * DafnyConfigurable creates the Configuration Window in the IntelliJ Settings. It implements the SearchableConfigurable.
 */
public class DafnyConfigurable implements Configurable {

    private DafnyConfigurationController dafnyConfigurationController;

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

    @Override
    public boolean isModified() {
        //It is always true, so the user could click on "Apply" everytime, even there are no modifications.
        return true;
    }

    @Override
    public void apply() throws ConfigurationException {
        dafnyConfigurationController.validate();
    }

    @Override
    public void reset() {
        dafnyConfigurationController.reset();
    }



}