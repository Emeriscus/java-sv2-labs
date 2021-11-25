package algorithmsdecision.town;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void containsFewerHabitantsTest() {

        List<Integer> habitants = Arrays.asList(150, 160, 140, 142, 135, 130, 120, 122, 155);
        Town town = new Town();

        assertTrue(town.containsFewerHabitants(habitants, 150));
        assertTrue(town.containsFewerHabitants(habitants, 121));
        assertFalse(town.containsFewerHabitants(habitants, 120));
    }

}