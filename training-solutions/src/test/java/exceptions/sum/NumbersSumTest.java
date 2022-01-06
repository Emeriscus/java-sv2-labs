package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void getSumFromIntWithInValidDataTest() {
        int[] numbers = null;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));

        assertEquals("The numbers cannot be null!", exception.getMessage());
        assertEquals(NullPointerException.class, exception.getCause().getClass());
    }

    @Test
    void getSumFromIntWithValidDataTest() {
        int[] numbers = {2, 4, 6, 8, 6};

        assertEquals(26, numbersSum.getSum(numbers));
    }

    @Test
    void getSumFromStringWithNullDataTest() {
        String[] numbers = null;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));

        assertEquals("The numbers cannot be null!", exception.getMessage());
        assertEquals(NullPointerException.class, exception.getCause().getClass());
    }

    @Test
    void getSumFromStringWithInvalidDataTest() {
        String[] numbers = {"2", "4", "aa", "8", "6"};

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));

        assertEquals("The numbers can only contain numbers", exception.getMessage());
        assertEquals(NumberFormatException.class, exception.getCause().getClass());
    }

    @Test
    void getSumFromStringWithValidDataTest() {
        String[] numbers = {"2", "4", "6", "8", "6"};

        assertEquals(26, numbersSum.getSum(numbers));
    }
}