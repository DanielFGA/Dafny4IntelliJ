package DafnyCommunication;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;


/**
 * Provides components for the communication with the Dafny Server
 * Comments translated and Code-Adaptation by Daniel Figia
 * @author Jannik Kühnemundt
 *
 */
public class DafnyConnectionProvider {

	private ProcessBuilder builder;
	private Process dafnyProcess;
	private InputStream inputstream;
	private OutputStream outputstream;
	private InputStreamReader inputStreamReader;
	private PrintWriter printWriter;

	/**
	 * Constructor for DafnyConnectionProvider. Provides a connection to the Dafny Server.
	 */
	public DafnyConnectionProvider(String dafny, String mono) throws IOException {

		//Check if operating system is macOS oder Linux, because they need mono
		if(DafnyConfigurationController.isMac()) {
			builder = new ProcessBuilder(mono + DafnyPluginStrings.MONO, dafny + DafnyPluginStrings.DAFNY_SERVER_EXE);
		}
		else {
			builder = new ProcessBuilder(dafny + DafnyPluginStrings.DAFNY_SERVER_EXE);

		}
		//builder.redirectErrorStream(true);
		
		dafnyProcess = builder.start();

		// Get Streams from process
		inputstream = dafnyProcess.getInputStream();
		outputstream = dafnyProcess.getOutputStream();
		printWriter = new PrintWriter(outputstream);

		inputStreamReader = new InputStreamReader(inputstream, StandardCharsets.US_ASCII);

	}
	
	/**
	 * Send data to the Dafny Server
	 * @param sourcecode sourcecode
	 * @return List with DafnyResponse-Objects
	 */
	public List<DafnyResponse> sendData(String sourcecode, String filename){
		DafnyMessage query = new DafnyMessage(sourcecode, false, filename);
		printWriter.println(query.encode());
		printWriter.flush();
		BufferedReader reader = new BufferedReader(inputStreamReader);
		String line;
        StringBuilder unparsedResponse = new StringBuilder();
	    try {

	    	while((line = reader.readLine()) != null) {
				unparsedResponse.append(line);
				unparsedResponse.append("\n");
	    	    if (line.contains(DafnyPluginStrings.DAFNY_SERVER_EOM)) {
	    	    	break;
	    	    }
	    	}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	    // create parser object
    	DafnyParser parser = new DafnyParser();
        return parser.parseServerResponse(unparsedResponse.toString(), sourcecode);
    }

	/**
	 * Close the stream and shutdown the process.
	 */
	public void disconnect() {
		try {
			outputstream.close();
			dafnyProcess.destroy();

		} catch (IOException e) {
			e.printStackTrace();
		}
		dafnyProcess.destroyForcibly();
	}

	/**
	 * Checks if the process is alive.
	 * @return
	 */
	public boolean isConnected() {
		return dafnyProcess != null && dafnyProcess.isAlive();
	}
}

				