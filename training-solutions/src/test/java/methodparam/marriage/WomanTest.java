package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {
    @Test
    void createManTest() {
        Woman woman = new Woman("Jane Doe", new ArrayList(Arrays.asList(new RegisterDate("születés", LocalDate.of(1978, 12, 23)))));

        assertEquals("Jane Doe", woman.getName());
        assertEquals(1, woman.getRegisterDates().size());
        assertEquals("születés", woman.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.of(1978, 12, 23), woman.getRegisterDates().get(0).getDate());
    }

    @Test
    void setNameTest() {
        Woman woman = new Woman("Jane Doe", new ArrayList(Arrays.asList(new RegisterDate("we", LocalDate.of(1978, 12, 23)))));
        woman.setName("Kalamenné");

        assertEquals("Kalamenné", woman.getName());
    }

}