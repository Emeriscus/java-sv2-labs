package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void getMaxTest() {

        Hill hill = new Hill();
        List<Integer> heights = Arrays.asList(1343, 1212, 1786, 1567, 1848);
        int expected = hill.getMax(heights);

        assertEquals(1848, expected);
    }
}