package DafnyCommunication;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.util.TextRange;
import org.eclipse.lsp4j.Diagnostic;

/**
 * Diese Klasse ist für das Parsen der Antwort des Dafny Prozesses zuständig
 * @author Jannik Kühnemundt
 *
 */
public class DafnyParser {
	
	// Regulärer Ausdruck für Parsen eines Errors
	private static final String REGEXP_ERROR = "\\((\\d+),(\\d+)\\):\\s*(Error|Warning|Related location|Info|Timed out on|Out of memory on|Out of resource on).*?: (.*)";
	// Regulärer Ausdruck für Parsen der Obligations
	//private static final String REGEXP_OBLIGATIONS = "\\[(\\d+) proof obligation(s|)\\]\\s+(verified|error)";
	private static final String REGEXP_OBLIGATIONS = "(__)default.(.*)\\...\\n..\\[(\\d+) proof obligation(s|)\\]\\s+(verified|error)";
	
	// Liste für Diagnostic-Objekte
	private List<DafnyResponse> diagnostic_list = new ArrayList<>();
	
	/**
	 * Antwort von Dafny wird geparst und gibt eine Liste mit Diagnostic Objekten
	 * wieder
	 * 
	 * @param response Antwort des Dafny Prozesses
	 * @return Liste mit Diagnostic Objekten
	 */
	public List<DafnyResponse> parseServerResponse(String response, String sourcecode) {
		// Debug der Ausgabe
		System.out.println(response);		
		parseError(response, sourcecode);
		//parseObligations(response);
		Diagnostic diag = new Diagnostic();
		// Mitteilung ob der Verifikationsprozess durchgelaufen ist
		/*if (response.contains("Verification completed successfully!")) {

			diag.setSeverity(DiagnosticSeverity.Information);
			diag.setMessage("Verification completed successfully!");
			diag.setRange(new Range(new Position(0, 0), new Position(0, 0)));
			diagnostic_list.add(diag);
		} else {
			diag.setSeverity(DiagnosticSeverity.Error);
			diag.setMessage("Verification didnt complete successfully!");
			diag.setRange(new Range(new Position(0, 0), new Position(0, 0)));
			diagnostic_list.add(diag);
		} */
		
		return diagnostic_list;
	}
	
	/**
	 * Sucht nach dem Pattern REGEXP_ERROR und speichert die gefunden Muster als Diagnostic-Objekte in  
	 * @param response
	 * @return
	 */
	private void parseError(String response, String sourcecode) {
		Pattern pattern = Pattern.compile(REGEXP_ERROR);
		Matcher matcher = pattern.matcher(response);
		// Matches durchlaufen
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
			// Alles andere wird als Error deklariert
			else {
				highlightSeverity = HighlightSeverity.ERROR;
			}
			message = matcher.group(4);

			int offsetStart = lineToOffset(Integer.parseInt(matcher.group(1)), sourcecode, false);
			int offsetEnd = lineToOffset(Integer.parseInt(matcher.group(1)), sourcecode, true);

			textRange = new TextRange(offsetStart, offsetEnd);

			diagnostic_list.add(new DafnyResponse(highlightSeverity, message, textRange));
		}
	}
	
	/**
	 * Zählt Proof Obligations
	 * //@param response Antwort des Dafny-Prozesses
	 * @return Diagnostic Objekt mit Anzahl an Verifizierungen und Errors
	 */
	/*private void parseObligations(String response) {
		Pattern pattern = Pattern.compile(REGEXP_OBLIGATIONS);
		Matcher matcher = pattern.matcher(response);
		while (matcher.find()) {
			Diagnostic diag = new Diagnostic();
			// Alles als Information, zusätzliche Unterscheidung würde meiner Meinung nach zur Verwirrung führen
			diag.setSeverity(DiagnosticSeverity.Information);
			diag.setMessage("Methode: " + matcher.group(2) + " ["+ matcher.group(3) + " proof obligations] " + matcher.group(5));
			diag.setRange(new Range(new Position(0, 0), new Position(0, 0)));
			diagnostic_list.add(diag);
		}
	} */

	public int lineToOffset(int line, String sorucecode, boolean end) {
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
