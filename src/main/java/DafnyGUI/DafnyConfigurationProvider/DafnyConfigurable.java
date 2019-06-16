package DafnyGUI.DafnyConfigurationProvider;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import Dafny.DafnyPluginStrings;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.IOException;

/**
 * DafnyConfigurable creates the Configuration Window in the IntelliJ Settings. It implements the SearchableConfigurable.
 */
public class DafnyConfigurable extends ConfigurableProvider implements Configurable  {

    private DafnyConfigurationController dafnyConfigurationController;

    public DafnyConfigurable() {
        dafnyConfigurationController = new DafnyConfigurationController();
    }

    @Nullable
    @Override
    public Configurable createConfigurable() {
        return this;
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

        try {
            dafnyConfigurationController.validate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void reset() {
        dafnyConfigurationController.reset();
    }



}
