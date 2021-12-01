package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    @Test
    void createManTest() {
        Man man = new Man("Joe Doe", new ArrayList(Arrays.asList(new RegisterDate("születés", LocalDate.of(1978, 12, 23)))));

        assertEquals("Joe Doe", man.getName());
        assertEquals(1, man.getRegisterDates().size());
        assertEquals("születés", man.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.of(1978, 12, 23), man.getRegisterDates().get(0).getDate());
    }

    @Test
    void setNameTest() {
        Man man = new Man("Joe Doe", new ArrayList(Arrays.asList(new RegisterDate("we", LocalDate.of(1978, 12, 23)))));
        man.setName("Kalamen");

        assertEquals("Kalamen", man.getName());
    }
}