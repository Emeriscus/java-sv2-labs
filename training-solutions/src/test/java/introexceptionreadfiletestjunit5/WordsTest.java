package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    private Words words=new Words();

    @Test
    void testgetFirstWordWithA(){
        Path path= Paths.get("src/test/resources/words.txt");
        assertEquals("Anna", words.getFirstWordWithA(path));
    }

    @Test
    void testGetFirstWordWithAWithoutFirstA(){
        Path path= Paths.get("src/test/resources/wordsWithoutFirstA.txt");
        assertEquals("A", words.getFirstWordWithA(path));
    }

    @Test
    void testgetFirstWordWithANonExistingFile(){
        Path path= Paths.get("src/test/resources/xyz.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(path));
        assertEquals("Nem létező fájl, vagy útvonal.", ise.getMessage());
    }
}