package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWord("alma");
        words.addWord("körte");
        words.addWord("meggy");
        words.addWord("banán");
        words.addWord("ananász");
        words.addWord("alom");
        words.addWord("birsalma");
        words.addWord("keksz");
        words.addWord("só");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> testWords = Arrays.asList("alma", "ananász", "alom");

        words.getWordsStartWith("a");
        assertEquals(testWords, words.getWords());
    }
    @Test
    void testGetWordsWithLength() {
        List<String> testWords = Arrays.asList("körte", "meggy", "banán", "keksz");

        words.getWordsWithLength(5);
        assertEquals(testWords, words.getWords());
    }
}
