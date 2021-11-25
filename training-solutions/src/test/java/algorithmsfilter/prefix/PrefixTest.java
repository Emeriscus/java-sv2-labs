package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void getWordsStartWithTest() {

        Prefix prefix = new Prefix();
        List<String> words = Arrays.asList("John", "Joe", "Jim", "Jack", "Joel", "Karl");

        assertEquals(3, prefix.getWordsStartWith(words, "Jo").size());
        assertEquals("John", prefix.getWordsStartWith(words, "John").get(0));
        assertNotEquals("Karl", prefix.getWordsStartWith(words, "John"));
        assertTrue(prefix.getWordsStartWith(words, "Jo").contains("Joe"));
        assertFalse(prefix.getWordsStartWith(words, "Jo").contains("Karl"));
    }
}