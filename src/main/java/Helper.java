import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Helper {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Daniel\\IdeaProjects\\jsonreader\\DafnyPlugin4Intellij\\src\\main\\resources\\highlightingKeywords.txt"));
        String line = "";
        String output = "";
        String[] outputSplit;
        String set = "";
        String sol = "";
        while ((line = br.readLine()) != null) {
            output+=line;
        }

        int marks[] = new int[] {2,2,2,2};

        outputSplit = output.split("-");

        for (String s : outputSplit) {
            if (s.startsWith("#")) set = s.substring(1);
            else {
                sol+=set + ".add(DafnyTypeImpl." + s.toUpperCase() + ");\n";
            }
        }
        System.out.println(sol);


    }
}
