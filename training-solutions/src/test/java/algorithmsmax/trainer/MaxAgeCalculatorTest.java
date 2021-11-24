package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void getTrainerWithMaxAgeTest() {

        List<Trainer> trainers = Arrays.asList(
                new Trainer("Joe", 35),
                new Trainer("Joe", 28),
                new Trainer("Joe", 31),
                new Trainer("Joe", 30),
                new Trainer("Joe", 42));

        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        Trainer expected = maxAgeCalculator.getTrainerWithMaxAge(trainers);

        assertEquals("Joe", expected.getName());
        assertEquals(42, expected.getAge());
    }
}
