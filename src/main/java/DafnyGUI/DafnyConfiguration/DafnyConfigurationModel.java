package DafnyGUI.DafnyConfiguration;

import DafnyGUI.DafnyPluginStrings;
import org.jetbrains.annotations.Nullable;

import java.io.File;


/**
 * DafnyConfigurationModel hold the data for the Dafny-Configurations.
 */
public class DafnyConfigurationModel {

    /**
     * The path to the Dafny files and Language Server
     */
    private String dafnyPath;
    /**
     * The path to mono. Can be null, if system is windows.
     */
    @Nullable
    private String monoPath;

    private String os;

    public DafnyConfigurationModel(String dafnyPath, @Nullable String monoPath, String os) {
        this.dafnyPath = dafnyPath;
        this.os = os;
        if (isMac()) this.monoPath = monoPath;
    }

    /**
     * Checks if ithe files Dafny.exe, Dafny_Sever.exe and DafnyLanguageServer.jar exist in the given path.
     * @return - true if all files exist, false if one file does not exist
     */
    public boolean testDafnyPath() {
        File dafnyExe = new File(dafnyPath + DafnyPluginStrings.DAFNY_EXE);
        File dafnyServer = new File(dafnyPath + DafnyPluginStrings.DAFNY_SERVER_EXE);
        File dafnyLanguageServer = new File(dafnyPath + DafnyPluginStrings.LANGUAGE_SERVER_JAR);
        return dafnyExe.exists() && dafnyServer.exists() && dafnyLanguageServer.exists();
    }

    public boolean testMonoPath() {
        File monoExe = new File(monoPath + DafnyPluginStrings.MONO_EXE);
        return isWindows() || monoExe.exists();
    }

    public String getDafnyPath() {
        return dafnyPath;
    }

    public String getMonoPath() {
        return monoPath;
    }

    public void setFilesPath(String filesPath) {
        this.dafnyPath = filesPath;
    }

    public void setMonoPath(String monoPath) {
        this.monoPath = monoPath;
    }

    public boolean isMac() {
        return os.equals("Mac");
    }

    public boolean isWindows() {
        return os.equals("Windows");
    }


}
