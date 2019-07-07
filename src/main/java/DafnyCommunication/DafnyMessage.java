package DafnyCommunication;

import com.google.gson.*;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Base64;

/**
 * Represents a message to the DafnyServer
 * Translated by Daniel Figia
 * @author Jannik Kühnemundt
 *
 */
public class DafnyMessage {


	private HashMap<String,Object> query;
	private Gson gson = new Gson();
	
	/**
	 * Constructor
	 * @param source Sourecode from a dafny prorgram or a path to a dafny program sourcecode file
	 * @param sourceisfile A boolean, that indicate, if the source is just sourcecode or a path to a dafny program sourcecode file
	 * @param filename The name of the file
	 */
	public DafnyMessage(String source, boolean sourceisfile, String filename) {		

		ArrayList<String> temp = new ArrayList<>();
		// Cachingbug avoid https://github.com/Microsoft/dafny/issues/143
		temp.add("/verifySnapshots:2");
		query = new HashMap<>();
		query.put("args", temp);
		query.put("source", source);
		query.put("sourceIsFile", sourceisfile);
		query.put("filename", filename);
	}
	
	/**
	 * Convert a map in a Base64 coded string
	 * @return Base64 coded JSON String
	 */
	public String encode() {
		String output = "";
		byte[] base64encode = new byte[0];

		base64encode = Base64.getEncoder().encode(gson.toJson(query).getBytes(StandardCharsets.US_ASCII));

		output = new String(base64encode, StandardCharsets.US_ASCII);
		return "verify" + "\n" + output + "\n" + DafnyPluginStrings.DAFNY_CLIENT_EOM;
	}
	
	/**
	 * String representation
	 * @return Returns a string of the object
	 */
	public String toString() {
        return (gson.toJson(query));
	}
}
