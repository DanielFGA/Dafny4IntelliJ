package DafnyCommunication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;


/**
 * Stellt Komponenten bereit um mit dem DafnyServer zu kommunizieren
 * @author Jannik Kühnemundt
 *
 */
public class DafnyConnectionProvider {

	public static final String DAFNY_SERVER_EOM = "[[DAFNY-SERVER: EOM]]";
	private ProcessBuilder builder;
	private Process dafnyProcess;
	private InputStream inputstream;
	private OutputStream outputstream;
	private InputStreamReader inputStreamReader;
	private PrintWriter printWriter;

	private String dafny;
	private String mono;
	
	/**
	 * Konstruktor der Klasse DafnyConnectionProvider, stellt eine Verbindung zu Dafny her
	 */
	public DafnyConnectionProvider(String dafny, String mono) throws IOException {

		// Einstellungsdaten holen
		this.dafny = dafny;
		this.mono = mono;
		
		// Betriebssystem abfragen, macOS und Linux benötigen mono
		if(System.getProperty("os.name").startsWith("Mac") || System.getProperty("os.name").startsWith("Linux")) {
			builder = new ProcessBuilder(mono + "/mono",dafny + "/DafnyServer.exe");
		}
		else {
			builder = new ProcessBuilder(dafny + "/DafnyServer.exe");

		}
		//builder.redirectErrorStream(true);
		
		dafnyProcess = builder.start();

		
		// Streams vom Prozess holen
		inputstream = dafnyProcess.getInputStream();
		outputstream = dafnyProcess.getOutputStream();
		printWriter = new PrintWriter(outputstream);
		try {
			inputStreamReader = new InputStreamReader(inputstream, "US-ASCII");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
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
		String line = null;
		StringBuilder response = new StringBuilder();
	    try {

	    	while((line = reader.readLine()) != null) {
	    	    response.append(line);
	    	    response.append("\n");
	    	    if (line.contains(DAFNY_SERVER_EOM)) {
	    	    	break;
	    	    }
	    	}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	    // Parser Objekt erstellen
    	DafnyParser parser = new DafnyParser();
        return parser.parseServerResponse(response.toString(), sourcecode);
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
}

				