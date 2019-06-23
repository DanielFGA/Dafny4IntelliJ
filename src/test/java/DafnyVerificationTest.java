import org.junit.Test;

import java.io.File;
import java.util.*;


public class DafnyVerificationTest {

    private Map<File, File> fileToExcept = new HashMap<>();


    @Test
    public void fillMap() {
        File folder = new File("src/test/dafnyTestData");
        List<File> listOfFiles = new ArrayList<>(Arrays.asList(folder.listFiles()));

        for (int i = 0; i < listOfFiles.size(); i++) {
            File actualFile = listOfFiles.get(i);
            if (actualFile.isFile() && actualFile.getName().endsWith(".dfy")) {
                fileToExcept.put(actualFile, null);
            } else if (actualFile.isFile() && actualFile.getName().endsWith(".expect")) {
                fileToExcept.put(new File(actualFile.getPath().substring(0, actualFile.getPath().length()-7)), actualFile);
            } else {
                if (actualFile.isDirectory()) {
                    List<File> newFiles = Arrays.asList(actualFile.listFiles());
                    listOfFiles.addAll(newFiles);
                } else {
                    actualFile.deleteOnExit();
                }
            }
        }
    }
}







