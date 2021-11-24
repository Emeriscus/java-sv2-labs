package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getNumberOfStudentsTest() {

        School school = new School();

        assertEquals(220, school.getNumberOfStudents(Arrays.asList(20, 50, 150)));
        assertNotEquals(200, school.getNumberOfStudents(Arrays.asList(20, 50, 150)));
    }
}
