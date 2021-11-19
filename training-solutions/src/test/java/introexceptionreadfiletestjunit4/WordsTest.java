package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class WordsTest {
    Path path = Paths.get("src/test/resources/words.txt");
    Path path2 = Paths.get("src/test/resources/wordsWithoutFirstA.txt");

    @Test
    public void testgetFirstWordWithA() {

        String firstWordWithA = new Words().getFirstWordWithA(path);
        assertEquals("Anna", firstWordWithA);
    }

    @Test
    public void testgetFirstWordWithoutA() {

        assertEquals("A", new Words().getFirstWordWithA(path2));

    }
}