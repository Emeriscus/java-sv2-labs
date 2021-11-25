package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void createStudentTest() {

        Student student = new Student("Pistike", "Szolnok");

        assertEquals("Szolnok", student.getAddress());
        assertEquals("Pistike", student.getName());
    }
}