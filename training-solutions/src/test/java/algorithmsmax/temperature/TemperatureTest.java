package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void getMinTest() {

        Temperature temperature = new Temperature();
        List<Integer> temperatures = Arrays.asList(15, 17, 32, -3, 34, -5);

        assertEquals(-5, temperature.getMin(temperatures));
    }
}