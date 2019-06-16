import DafnyLanguage.DafnyParserDefinition;
import com.intellij.lang.ParserDefinition;
import com.intellij.testFramework.ParsingTestCase;
import org.jetbrains.annotations.NotNull;


public class DafnyParserTest extends ParsingTestCase {

    protected DafnyParserTest(@NotNull String dataPath, @NotNull String fileExt, @NotNull ParserDefinition... definitions) {
        super("dafnyTestData", "dfy", new DafnyParserDefinition());
    }
}

