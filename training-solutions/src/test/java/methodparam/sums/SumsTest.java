package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumsTest {

    @Test
    void createTest() {
        Sums sums = new Sums(15.2, -25.8);

        assertEquals(15.2, sums.getSumPositives());
        assertEquals(-25.8, sums.getSumNegatives());
    }
}