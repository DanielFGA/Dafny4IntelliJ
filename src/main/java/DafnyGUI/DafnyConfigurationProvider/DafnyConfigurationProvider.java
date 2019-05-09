package DafnyGUI.DafnyConfigurationProvider;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DafnyConfigurationProvider extends ConfigurableProvider {

    private DafnyConfigurable dafnyConfigurable;
    private DafnyConfigurationController dafnyConfigurationController;

    public DafnyConfigurationProvider() {
        dafnyConfigurationController = new DafnyConfigurationController();
        dafnyConfigurable = new DafnyConfigurable(this);
    }

    @Nullable
    @Override
    public Configurable createConfigurable() {
        return dafnyConfigurable;
    }

    public JPanel getConfigurationPanel() {
        return dafnyConfigurationController.getConfigurationPanel();
    }

    public void setPathAndOS() {
        dafnyConfigurationController.savePathandOS();
    }





}
