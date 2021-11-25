package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void containsLongerWordTest() {
        Word word = new Word();
        List<String> words = Arrays.asList("pénz", "festmény", "puzzle", "rádió", "tv");

        assertTrue(word.containsLongerWord(words, "p"));
        assertFalse(word.containsLongerWord(words, "festmény"));
    }
}