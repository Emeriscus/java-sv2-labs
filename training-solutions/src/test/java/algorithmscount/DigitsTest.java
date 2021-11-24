package algorithmscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void getNumbersTest() {

        Digits digits = new Digits();

        assertEquals(9, digits.getCountOfNumbers());
    }
}