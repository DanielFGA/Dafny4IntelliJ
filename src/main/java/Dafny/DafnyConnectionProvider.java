package Dafny;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Stellt Komponenten bereit um mit dem DafnyServer zu kommunizieren
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
	 * Konstruktor der Klasse DafnyConnectionProvider, stellt eine Verbindung zu Dafny her
	 */
	public DafnyConnectionProvider(String dafny, String mono) throws IOException {

		// Betriebssystem abfragen, macOS und Linux benötigen mono
		if(DafnyConfigurationController.isMac()) {
			builder = new ProcessBuilder(mono + DafnyPluginStrings.MONO_EXE, dafny + DafnyPluginStrings.DAFNY_SERVER_EXE);
		}
		else {
			builder = new ProcessBuilder(dafny + DafnyPluginStrings.DAFNY_SERVER_EXE);

		}
		//builder.redirectErrorStream(true);
		
		dafnyProcess = builder.start();

		
		// Streams vom Prozess holen
		inputstream = dafnyProcess.getInputStream();
		outputstream = dafnyProcess.getOutputStream();
		printWriter = new PrintWriter(outputstream);

		inputStreamReader = new InputStreamReader(inputstream, StandardCharsets.US_ASCII);

	}
	
	/**
	 * Sendet Daten an den Dafny-Prozess
	 * @param sourcecode Quellcode
	 * @return Liste mit Diagnostic Objekten
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
	    // Parser Objekt erstellen
    	DafnyParser parser = new DafnyParser();
        return parser.parseServerResponse(unparsedResponse.toString(), sourcecode);
    }

	/**
	 * Schließt den Stream und beendet den Prozess
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

	public boolean isConnected() {
		return dafnyProcess == null ? false : dafnyProcess.isAlive();
	}
}

				