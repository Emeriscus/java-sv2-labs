package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    @Test
    void createRegisterTest() {

        RegisterDate registerDate = new RegisterDate("házzaságkötés", LocalDate.of(2000, 11, 11));

        assertEquals(LocalDate.of(2000, 11, 11), registerDate.getDate());
        assertEquals("házzaságkötés", registerDate.getDescription());
    }

}