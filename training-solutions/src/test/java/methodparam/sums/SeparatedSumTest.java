package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void sumTest() {
        SeparatedSum separatedSum = new SeparatedSum();
        Sums sums = separatedSum.sum(separatedSum.readFromFile());

        assertEquals(110.6, sums.getSumPositives(), 0.000001);
        assertEquals(-153.3, sums.getSumNegatives(), 0.000001);
    }
}