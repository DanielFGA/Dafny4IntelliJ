package DafnyCommunication;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.util.TextRange;

/**
 * This class parses a answer from the DafnyServer into a List of DafnyRespones.
 * Translated and adjust by Daniel Figia
 * @author Jannik Kühnemundt
 * @author Daniel Figia
 */
public class DafnyParser {

	/**
	 * Regular expression for parsing a error
	 */
	private static final String REGEXP_ERROR = "\\((\\d+),(\\d+)\\):\\s*(Error|Warning|Related location|Info|Timed out on|Out of memory on|Out of resource on).*?: (.*)";

	/**
	 * Regular expression for parsing a obligations
	 */
	private static final String REGEXP_OBLIGATIONS = "(__)default.(.*)\\...\\n..\\[(\\d+) proof obligation(s|)\\]\\s+(verified|error)";

	/**
	 * List for the responses
	 */
	private List<DafnyResponse> dafnyResponseList = new ArrayList<>();

	/**
	 * Answer from DafnyServer gets parsed and returns a List with DafnyResponses
	 * 
	 * @param response Answer from DafnyServer
	 * @return  List with DafnyResponses
	 */
	public List<DafnyResponse> parseServerResponse(String response, String sourcecode) {
		parseError(response, sourcecode);
		parseObligations(response);
		//Message if the verification run through
		if (response.contains(DafnyPluginStrings.VERIFIED_MESSAGE)) {
			HighlightSeverity verfiedSeverity = new HighlightSeverity("INFORMATION", 1);
			String message = DafnyPluginStrings.VERIFIED_MESSAGE;
			TextRange textRange = new TextRange(0,0);
			dafnyResponseList.add(new DafnyResponse(verfiedSeverity, message, textRange, 0));
		} else {
			HighlightSeverity highlightSeverity = HighlightSeverity.ERROR;
			String message = DafnyPluginStrings.VERIFIED_MESSAGE;
			TextRange textRange = new TextRange(0,0);
			dafnyResponseList.add(new DafnyResponse(highlightSeverity, message, textRange, 0));
		}
		
		return dafnyResponseList;
	}
	
	/**
	 * Search with the pattern REGEXP_ERROR and saved the found patterns as DafnyResponses.
	 * @param response Answer from DafnyServer
	 * @return  List with DafnyResponses
	 */
	private void parseError(String response, String sourcecode) {
		Pattern pattern = Pattern.compile(REGEXP_ERROR);
		Matcher matcher = pattern.matcher(response);
		// run through matches
		while (matcher.find()) {
			HighlightSeverity highlightSeverity;
			String message;
			TextRange textRange;
			if(matcher.group(3).contains("Warning")) {
				highlightSeverity = HighlightSeverity.WARNING;
			}
			else if(matcher.group(3).contains("Info")) {
				highlightSeverity = HighlightSeverity.INFORMATION;
			}
			// everything else will be marked as an error.
			else {
				highlightSeverity = HighlightSeverity.ERROR;
			}
			message = matcher.group(4);

			//Adjust the range
			int offsetStart = lineToOffset(Integer.parseInt(matcher.group(1)), sourcecode, false);
			int offsetEnd = lineToOffset(Integer.parseInt(matcher.group(1)), sourcecode, true);

			textRange = new TextRange(offsetStart, offsetEnd);

			dafnyResponseList.add(new DafnyResponse(highlightSeverity, message, textRange, Integer.parseInt(matcher.group(1))));
		}
	}
	

	 /** Count proof obligations
	 * @param response Answer from DafnyServer
	 * @return List with DafnyResponses
	 */
	private void parseObligations(String response) {
		Pattern pattern = Pattern.compile(REGEXP_OBLIGATIONS);
		Matcher matcher = pattern.matcher(response);
		while (matcher.find()) {

			HighlightSeverity proofObligationSeverity = new HighlightSeverity("PROOF OBLIGATION", 2);
			String message = "Methode: " + matcher.group(2) + " [" + matcher.group(3) + " proof obligations] " + matcher.group(5);
			TextRange textRange = new TextRange(0, 0);

			dafnyResponseList.add(new DafnyResponse(proofObligationSeverity, message, textRange, 0));
		}
	}

	/**
	 * If end is false: Finds out at which position the first non-space char is located in the specified sourcecode in the specified  line is.
	 * If end is true: Finds out at which position in the specified sourcecode the specified line ends.
	 * @param line The specified line
	 * @param sorucecode The specified sourcecode
	 * @param end True -> find first non-space char position, false -> find end of line
	 * @return The position.
	 */
	private int lineToOffset(int line, String sorucecode, boolean end) {
		int counter = 1;
		int offset = 0;
		for (Character c : sorucecode.toCharArray()) {
			if (counter == line && !end && !c.equals(' ')) return offset;
			if (counter == line && end && c.equals('\n')) return offset;
			offset++;
			if (c.equals('\n')) counter++;
		}
		return sorucecode.length()-1;
	}
}
