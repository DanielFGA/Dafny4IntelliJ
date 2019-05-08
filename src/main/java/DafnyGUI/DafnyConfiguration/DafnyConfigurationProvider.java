package DafnyGUI.DafnyConfiguration;

import DafnyGUI.DafnyUI.DafnyConfigurationWindowView;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DafnyConfigurationProvider extends ConfigurableProvider {

    private DafnyConfigurationWindowView dafnyConfigurationWindowView;
    private Configurable dafnyConfigurable;

    public DafnyConfigurationProvider() {
        dafnyConfigurationWindowView = new DafnyConfigurationWindowView();
        dafnyConfigurable = new DafnyConfigurable(this);
    }

    @Nullable
    @Override
    public Configurable createConfigurable() {
        return dafnyConfigurable;
    }

    public JPanel getConfigurationPanel() {
        return dafnyConfigurationWindowView.getConfigurationPanel();
    }
}
