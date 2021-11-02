package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        Numbers numbers = new Numbers();

        int numsInput[] = {2, 8, 5, 6, 2, 3, 9};

        int numsOutput[] = {2, 8, 0, 6, 2, 0, 0};

        assertArrayEquals(numsOutput, numbers.getEvenNumbers(numsInput));


    }
}
