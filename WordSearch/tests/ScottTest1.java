import org.junit.Test;

import static org.junit.Assert.*;

public class ScottTest1 {

    @Test
    public void getSentence() {
        Scott sentence = new Scott("This is a series of words");
        assertEquals("This is a series of words", sentence.getSentence());
    }
}