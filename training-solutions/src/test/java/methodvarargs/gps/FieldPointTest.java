package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    @Test
    void createFieldPointTest() {

        FieldPoint fieldPoint = new FieldPoint
                (LocalDateTime.of(2021, 10, 12, 7, 50), 47.1929, 20.1985);

        assertEquals(47.1929, fieldPoint.getLatitude(), 0.00001);
        assertEquals(20.1985, fieldPoint.getLongitude(), 0.00001);
        assertEquals(LocalDateTime.of(2021, 10, 12, 7, 50), fieldPoint.getTimeOfSetting());
    }
}