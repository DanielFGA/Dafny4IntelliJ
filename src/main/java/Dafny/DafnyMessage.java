package Dafny;

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
		byte[] base64encode = new byte[0];

		base64encode = Base64.getEncoder().encode(gson.toJson(query).getBytes(StandardCharsets.US_ASCII));

		output = new String(base64encode, StandardCharsets.US_ASCII);
		String s = "verify" + "\n" + output + "\n" + DafnyPluginStrings.DAFNY_CLIENT_EOM;
		return s;
	}
	
	/**
	 * Stringrepräsentation
	 * @return Gibt einen String des Objekts aus
	 */
	public String toString() {
        return (gson.toJson(query));
		
	}
}
