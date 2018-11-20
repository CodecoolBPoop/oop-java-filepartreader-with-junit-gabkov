import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileWordAnalyzer {

    FilePartReader filePartReader;

    FileWordAnalyzer(FilePartReader filePartReader){
        this.filePartReader = filePartReader;
    }


    public List getWordsOrderedAlphabetically () throws Exception{
        List<String> words = getWords();
        Collections.sort(words);
        return words;
    }

    public List getWordsContainingSubstring (String subString ) throws Exception{
        List<String> words = getWords();
        List<String> outPut = new ArrayList<>();
        for (String word : words) {
            if (word.contains(subString)){
                outPut.add(word);
            }
        }
        return outPut;
    }


    public List getStringsWhichPalindromes () throws Exception{
        List<String> words = getWords();
        List<String> outPut = new ArrayList<>();
        for (String word : words) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            if (word.equals(reverseWord)){
                outPut.add(word);
            }
        }
        return outPut;
    }


    private List getWords() throws Exception {
        String inputString = filePartReader.readLines();
        List<String> words = Arrays.asList(inputString.split("\n"));
        return words;
    }


    public static void main(String[] args) throws Exception {
        FilePartReader fr = new FilePartReader();
        fr.setup("input.txt", 1,7);
        FileWordAnalyzer fa = new FileWordAnalyzer(fr);
        System.out.println(fa.getWordsOrderedAlphabetically());
        System.out.println(fa.getWordsContainingSubstring("aa"));
        System.out.println(fa.getStringsWhichPalindromes());
    }

}
