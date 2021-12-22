package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    Path path = Path.of("src/test/resources/longword.txt");

    @Test
    void getLongWordTest() {

        LongWord longWord = new LongWord(path);

        assertEquals("LONGWORD", longWord.getLongWord());
    }

    @Test
    void getLongWordWithInvalidFileNameTest() {

        LongWord longWord = new LongWord(Path.of("src/test/resources/longwor.txt"));

        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> longWord.getLongWord());

        assertEquals("Cannot read file", ise.getMessage());
    }
}