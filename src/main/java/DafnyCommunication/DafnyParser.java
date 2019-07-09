package DafnyCommunication;

import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.util.TextRange;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
			textRange = lineToTextRange(Integer.parseInt(matcher.group(1)), sourcecode);

			dafnyResponseList.add(new DafnyResponse(highlightSeverity, message, textRange, Integer.parseInt(matcher.group(1))));
		}
	}
	

	 /** Count proof obligations
	 * @param response Answer from DafnyServer
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
	 * @return The position.
	 */
	private TextRange lineToTextRange(int line, String sorucecode) {

		if (line < 1) return new TextRange(0,0);

		int currentLine = 1;
		int currentCharIndex = 0;

		int start = -1;
		int end = -1;

		for (Character c : sorucecode.toCharArray()) {
			if (currentLine == line) {
				if (!c.equals(' ') && start == -1) start = currentCharIndex;
				if (c.equals('\n') && end == -1) end = currentCharIndex;
			}
			currentCharIndex++;
			if (c.equals('\n')) currentLine++;
		}

		return (start == -1 || end == -1) ?
				new TextRange(sorucecode.length()-1, sorucecode.length()-1) :
				new TextRange(start, end);
	}
}
