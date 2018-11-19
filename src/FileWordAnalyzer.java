import java.util.List;

public class FileWordAnalyzer {

    FilePartReader filePartReader;

    FileWordAnalyzer(FilePartReader filePartReader){
        this.filePartReader = filePartReader;
    }


    public List getWordsOrderedAlphabetically (){
        filePartReader.readLines();
    }

    public List getWordsContainingSubstring (String subString ){
        filePartReader.readLines();
    }


    public List getStringsWhichPalindromes (){
        filePartReader.readLines();
    }

}
