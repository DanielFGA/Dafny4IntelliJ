package DafnyGUI.DafnyConfiguration;

import DafnyGUI.DafnyPluginStrings;
import java.io.File;


/**
 * DafnyConfigurationModel does the calculation and processing for the Dafny-Configurations.
 * DafnyConfigurationController creates and trigger the methods.
 */
public class DafnyConfigurationModel {

    private String dafnyPath;
    private String monoPath;

    public DafnyConfigurationModel(String path, String monoPath) {
        dafnyPath = path;
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
        return System.getProperty("os.name").startsWith("Mac");
    }

    public boolean isWindows() {
        return System.getProperty("os.name").startsWith("Windows");
    }



}
