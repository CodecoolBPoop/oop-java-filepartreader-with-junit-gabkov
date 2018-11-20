import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {
    @Test
    public void testSetupToLineBelow1ThrowsExceptio(){
        FilePartReader fr = new FilePartReader();
        assertThrows(IllegalArgumentException.class, ()-> {
            fr.setup("input.txt", 1, 0);
        });
    }

    @Test
    public void testReaderFunction() throws Exception{
        FilePartReader fr = new FilePartReader();
        fr.setup("input.txt", 1, 7);
        fr.read();
        assertNotNull(fr.getRawInputString());
    }
}