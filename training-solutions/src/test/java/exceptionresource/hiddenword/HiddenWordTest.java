package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hiddenWord = new HiddenWord();


    @Test
    void getHiddenWordWithInvalidFileTest() {
        Path path = Path.of("src/test/resources/hiddenwor.txt");
        Exception expected = assertThrows(IllegalArgumentException.class,
                () -> hiddenWord.getHiddenWord(path));

        assertEquals("File not found", expected.getMessage());
    }

    @Test
    void getHiddenWordTest() {
        Path path = Path.of("src/test/resources/hiddenword.txt");

        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(path));
    }
}