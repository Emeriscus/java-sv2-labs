package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void getFirstTwoLettersTest() {

        TwoLetters twoLetters = new TwoLetters();

        List<String> words = Arrays.asList("betyár", "pék", "kórház", "béke", "róka");
        List<String> expected = Arrays.asList("be", "pé", "kó", "bé", "ró");

        assertEquals(expected, twoLetters.getFirstTwoLetters(words));
    }
}