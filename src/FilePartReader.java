import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FilePartReader {

    String filePath;
    Integer fromLine;
    Integer toLine;

    private String rawInputString;

    //FileReader fileReader;
    FilePartReader(){
        filePath = "/lol/invalid";
        fromLine = 1;
        toLine = 1;
    }

    public String getRawInputString() {
        return rawInputString;
    }


    public void setup(String filePath, Integer fromLine, Integer toLine){
        if(toLine < fromLine || fromLine < 1)  throw new IllegalArgumentException("Not valid input");
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }


    public String read() throws Exception{
        rawInputString = new String(Files.readAllBytes(Paths.get(filePath)));
        return rawInputString;
    }

    public String readLines() throws Exception{
        String inputData = this.read();
        String[] parts = inputData.split("\n");
        String[] toReturn = Arrays.copyOfRange(parts, fromLine-1, toLine);

        return String.join("\n", toReturn);
    }

/*    public static void main(String[] args) throws Exception
    {
        FilePartReader fr = new FilePartReader();
        fr.setup("input.txt", 1,7);
        System.out.println(fr.readLines());
    }*/

}
