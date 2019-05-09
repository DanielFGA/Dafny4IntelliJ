package DafnyGUI.DafnyConfigurationProvider;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DafnyConfigurable implements SearchableConfigurable {

    private DafnyConfigurationProvider dafnyConfigurationProvider;

    public DafnyConfigurable(DafnyConfigurationProvider dafnyConfigurationProvider) {
        this.dafnyConfigurationProvider = dafnyConfigurationProvider;
    }

    @NotNull
    @Override
    public String getId() {
        return "Dafny";
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Dafny";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return dafnyConfigurationProvider.getConfigurationPanel();
    }

    @Override
    public boolean isModified() {
        return true;
    }

    @Override
    public void apply() throws ConfigurationException {
        dafnyConfigurationProvider.setPathAndOS();
    }


}
