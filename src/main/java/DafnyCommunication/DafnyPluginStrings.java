package DafnyCommunication;

import java.io.File;

/**
 * Represent all Strings.
 */
public class DafnyPluginStrings {

    public static final String DAFNY_EXE = File.separator + "Dafny.exe";
    public static final String DAFNY_SERVER_EXE = File.separator + "DafnyServer.exe";
    public static final String MONO_FRAMEWORK = File.separator + "Versions" + File.separator + "Current" + File.separator + "bin" + File.separator + "mono";

    public static final String DAFNY = "Dafny";
    public static final String DAFNY_FILE_ABBR = "dfy";
    public static final String PDB_FILE_ABBR  = "pdb";
    public static final String DLL_MDB_FILE_ABBR  = "dll.mdb";
    public static final String EXE_MDB_FILE_ABBR  = "exe.mdb";
    public static final String EXE_FILE_ABBR  = "exe";
    public static final String DLL_FILE_ABBR  = "dll";
    public static final String DAFNY_FILE = "." + DAFNY_FILE_ABBR;
    public static final String EXE_FILE  = "." + EXE_FILE_ABBR;

    public static final String FILE_TYPE = "Dafny File";
    public static final String FILE_TYPE_DESCRIPTION = "Dafny language file";

    public static final String ICON_PATH = "Dafny4IntelliJ_Icon.png";

    public static final String SET_PATH = "Set Path";

    public static final String FILES_DOWNLOAD_LINK = "https://github.com/microsoft/dafny/releases/tag/v2.3.0";
    public static final String MONO_DOWNLOAD_LINK = "https://www.mono-project.com/docs/getting-started/install/mac/";

    public static final String DAFNY_CONFIGURATION_XML = "DafnyConfiguration.xml";

    public static final String OS_MACOS = "Mac";
    public static final String OS_WINDOWS = "Windows";

    public static final String INVALID_PATH_TITLE = "Invalid Dafny files path";
    public static final String INVALID_PATH_MESSAGE = "The path to the Dafny files is invalid. Please check it again.";
    public static final String INVALID_MONO_TITLE = "Invalid Mono Path";
    public static final String INVALID_MONO_MESSAGE = "The path to Mono is invalid. Please check it again.";
    public static final String INVALID_CONFIGURATION = "Dafny is not connected. Maybe the Dafny configuration is incomplete.\n Please check the configuration (Settings/Language and Frameworks/Dafny) and/or restart Dafny.";

    public static final String DAFNY_MODULE = "DAFNY_MODULE";
    public static final String DAFNY_MODULE_DESCRIPTION = "Add support for Dafny";
    public static final String DAFNY_MODULE_SRC_DIR_NAME = "src";

    public static final String DAFNY_TOOL_WINDOW = "Dafny Tool Window";
    public static final String VERIFYING = "Verifying, please wait...";
    public static final String COMPILING = "Compiling, please wait...";
    public static final String COMPILING_CANCEL = "Cancel compiling, please wait...";
    public static final String NO_SELECTED_FILE = "No Dafny-File selected";
    public static final String NO_MAIN_METHOD = "No Main Method";
    public static final String OUTPUT_FILE_NAME = "o_u_t_p_u_t.";
    public static final String DAFNY_OUTPUT_FILE_NAME = OUTPUT_FILE_NAME + DAFNY_FILE_ABBR;
    public static final String DAFNY_RESET_START = "Resetting, please wait...";
    public static final String DAFNY_RESET_END = "Dafny was restarted.";
    public static final String DAFNY_VERIFICATION_RESULTS ="Verification results for file ";
    public static final String DAFNY_RUN_OUTPUT = "Output for file ";

    public static final String DAFNY_SERVER_EOM = "[[DAFNY-SERVER: EOM]]";
    public static final String DAFNY_CLIENT_EOM = "[[DAFNY-CLIENT: EOM]]";
    public static final String NOT_VERIFIED_MESSAGE = "Not verified yet. Please try again.";
    public static final String VERIFIED_MESSAGE = "Verification completed successfully!";

    public static final String VERIFIED = "Verified";
    public static final String NOT_VERIFIED = "Not Verified";

}
