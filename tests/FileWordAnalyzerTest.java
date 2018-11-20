import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {
    @Test
    void getWordsOrderedAlphabetically() throws Exception{
        String[] sortedWordsArray = {"ez az input","fáj a fogaaam" ,"igen", "ja", "lol", "műűűködik hahahha", "na mizu",
                "remélem működik a dolog"};
        List<String> sortedWordsList = Arrays.asList(sortedWordsArray);
        FilePartReader fr = new FilePartReader();
        fr.setup("input.txt", 1,8);
        FileWordAnalyzer fa = new FileWordAnalyzer(fr);
        assertEquals(sortedWordsList, fa.getWordsOrderedAlphabetically());
    }

    @Test
    void getWordsContainingSubstring() throws Exception{
        String[] expectedWordsArray = {"fáj a fogaaam"};
        List<String> expecedWordsList = Arrays.asList(expectedWordsArray);
        FilePartReader fr = new FilePartReader();
        fr.setup("input.txt", 1,8);
        FileWordAnalyzer fa = new FileWordAnalyzer(fr);
        assertEquals(expecedWordsList, fa.getWordsContainingSubstring("aaa"));
    }

    @Test
    void getStringsWhichPalindromes() throws Exception{
        String[] expectedWordsArray = {"lol"};
        List<String> expecedWordsList = Arrays.asList(expectedWordsArray);
        FilePartReader fr = new FilePartReader();
        fr.setup("input.txt", 1,8);
        FileWordAnalyzer fa = new FileWordAnalyzer(fr);
        assertEquals(expecedWordsList, fa.getStringsWhichPalindromes());
    }
}