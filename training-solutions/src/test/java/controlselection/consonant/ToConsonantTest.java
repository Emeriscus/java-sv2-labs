package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {

    ToConsonant toConsonant = new ToConsonant();

    @Test
    void toCosonanTest() {
        char result = toConsonant.toconsonant('e');

        assertEquals('f', result);
    }

}
