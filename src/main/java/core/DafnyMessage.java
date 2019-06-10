package core;

import com.google.gson.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Base64;

/**
 * Repärsentiert eine Nachricht an den DafnyServer
 * @author Jannik Kühnemundt
 *
 */
public class DafnyMessage {

	public static final String DAFNY_CLIENT_EOM = "[[DAFNY-CLIENT: EOM]]";
	private HashMap<String,Object> query;
	private Gson gson = new Gson();
	
	/**
	 * Konstruktor einer DafnyMessage
	 * @param source Quellcode von einem Dafny Programm oder der Pfad zu einem Dafny-Programm
	 * @param sourceisfile Ein boolescher Wert, der angibt ob ’source’ der Quellcode oder diePfadangabe zum Dafny-Programm ist.
	 * @param filename Der Name der Datei
	 */
	public DafnyMessage(String source, boolean sourceisfile, String filename) {		
		
		// TODO In Zukunft könnten weitere Argumente über die Einstellungen unterstützt werden.
		ArrayList<String> temp = new ArrayList<String>();
		// Cachingbug umgehen https://github.com/Microsoft/dafny/issues/143
		temp.add("/verifySnapshots:2");
		query = new HashMap<>();
		query.put("args", temp);
		query.put("source", source);
		query.put("sourceIsFile", sourceisfile);
		query.put("filename", filename);
	}
	
	/**
	 * Konvertiert eine HashMap in einen Base64 kodierten String
	 * @return Base64 kodierter JSON String
	 */
	public String encode() {
		String output = "";
		byte[] base64encode = Base64.getEncoder().encode(gson.toJson(query).getBytes(StandardCharsets.US_ASCII));

		try {
			output = new String(base64encode, "US-ASCII");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "verify" + "\n" + output + "\n" + DAFNY_CLIENT_EOM;
	}
	
	/**
	 * Stringrepräsentation
	 * @return Gibt einen String des Objekts aus
	 */
	public String toString() {
        return (gson.toJson(query));
		
	}
}
