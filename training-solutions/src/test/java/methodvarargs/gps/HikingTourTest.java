package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    @Test
    void logFieldPointsTest() {

        HikingTour hikingTour = new HikingTour();
        FieldPoint[] fieldPoints = {
                new FieldPoint(LocalDateTime.of(2021, 10, 11, 7, 0), 47.1929, 20.1985),
                new FieldPoint(LocalDateTime.of(2021, 10, 11, 7, 50), 47.2029, 20.2285),
                new FieldPoint(LocalDateTime.of(2021, 10, 11, 8, 25), 47.2229, 20.2385),
                new FieldPoint(LocalDateTime.of(2021, 10, 11, 9, 30), 47.2529, 20.2415)
        };
        hikingTour.logFieldPoints(LocalDateTime.of(2021, 10, 11, 9, 40), fieldPoints);

        assertEquals(4, hikingTour.getFieldPoints().size());
        assertEquals(LocalDateTime.of(2021, 10, 11, 9, 40),
                hikingTour.getFieldPoints().get(2).getTimeOfLogging());
        assertEquals(LocalDateTime.of(2021, 10, 11, 8, 25),
                hikingTour.getFieldPoints().get(2).getTimeOfSetting());
        assertEquals(47.2029,
                hikingTour.getFieldPoints().get(1).getLatitude());
    }

    @Test
    void logFieldPointsWithNullTimeTest() {
        HikingTour hikingTour = new HikingTour();
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> hikingTour.logFieldPoints(null,
                        new FieldPoint(LocalDateTime.of(2021, 10, 11, 7, 0), 47.1929, 20.1985),
                        new FieldPoint(LocalDateTime.of(2021, 10, 11, 7, 50), 47.2029, 20.2285),
                        new FieldPoint(LocalDateTime.of(2021, 10, 11, 8, 25), 47.2229, 20.2385),
                        new FieldPoint(LocalDateTime.of(2021, 10, 11, 9, 30), 47.2529, 20.2415)
                ));
        assertEquals("The logging time cannot null", ex.getMessage());
    }
}