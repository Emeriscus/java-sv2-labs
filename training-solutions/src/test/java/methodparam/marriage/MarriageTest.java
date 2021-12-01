package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void getMarriedTest() {

        Marriage marriage = new Marriage();
        Woman woman = new Woman("Jane Smith", new ArrayList(Arrays.asList(new RegisterDate("születés", LocalDate.of(1978, 12, 23)))));
        Man man = new Man("Joe Doe", new ArrayList(Arrays.asList(new RegisterDate("születés", LocalDate.of(1976, 10, 10)))));

        marriage.getMarried(woman, man);

        assertEquals("Jane Doe", woman.getName());
        assertEquals(2, man.getRegisterDates().size());
        assertEquals(2, woman.getRegisterDates().size());
        assertEquals("házasságkötés ideje", man.getRegisterDates().get(1).getDescription());
        assertEquals("házasságkötés ideje", woman.getRegisterDates().get(1).getDescription());
        assertEquals(LocalDate.now(), man.getRegisterDates().get(1).getDate());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(1).getDate());
    }
}