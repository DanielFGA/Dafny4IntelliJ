package DafnyGUI.DafnyConfiguration;

import org.jetbrains.annotations.Nullable;

import java.io.File;

import static DafnyCommunication.DafnyPluginStrings.*;


/**
 * DafnyConfigurationModel hold the data for the Dafny-Configurations.
 */
public class DafnyConfigurationModel {

    /**
     * The path to the Dafny files
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
        this.monoPath = monoPath;
    }

    /**
     * Checks if the dafny path is valid and if the files Dafny.exe and Dafny_Sever.exe exist in the given path.
     *
     * @return - true if all files exist, false if one file does not exist
     */
    public boolean testDafnyPath() {
        if (dafnyPath == null) return false;
        File dafnyExe = new File(dafnyPath + DAFNY_EXE);
        File dafnyServer = new File(dafnyPath + DAFNY_SERVER_EXE);
        return dafnyExe.exists() && dafnyServer.exists();
    }

    /**
     * Checks if the mono path is valid and if the file mono.exe exist in the given path.
     *
     * @return - true if the file exist, false if one file does not exist
     */
    public boolean testMonoPath() {
        if (isWindows()) return true;
        if (monoPath == null) return false;
        File mono = new File(monoPath + MONO); //MONO = FileSeperator + "mono"
        return mono.exists();
    }

    public String getDafnyPath() {
        return dafnyPath;
    }

    @Nullable
    public String getMonoPath() {
        return monoPath;
    }

    public void setFilesPath(String filesPath) {
        this.dafnyPath = filesPath;
    }

    public void setMonoPath(@Nullable String monoPath) {
        this.monoPath = monoPath;
    }

    public boolean isMac() {
        return os.equals(OS_MACOS);
    }

    public boolean isWindows() {
        return os.equals(OS_WINDOWS);
    }


}
