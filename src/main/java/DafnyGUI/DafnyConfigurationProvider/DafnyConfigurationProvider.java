package DafnyGUI.DafnyConfigurationProvider;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * DafnyConfigurationProvider is needed for the Plugin-Configurations. Its extends ConfigurableProvider from the
 * IntelliJ OpenAPI and provide a own Configuration-Window in the IntelliJ Settings. There the user can set and test
 * the source path to the Dafny files/language server, set the operating system he is working with (Windows or macOS)
 * and can go to the download site of the source files, though his default web browser. The configuration gets saved as
 * a persistent state in the xml file DafnyConfiguration.xml.
 *
 * DafnyConfigurationProvider is registered  in the plugin.xml as Project Configurable.
 */
public class DafnyConfigurationProvider extends ConfigurableProvider {

    private DafnyConfigurable dafnyConfigurable;

    public DafnyConfigurationProvider() {
        dafnyConfigurable = new DafnyConfigurable();
    }

    @Nullable
    @Override
    public Configurable createConfigurable() {
        return dafnyConfigurable;
    }

}
