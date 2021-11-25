package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    PrimarySchool primarySchool;

    @BeforeEach
    void init() {
        primarySchool = new PrimarySchool(Arrays.asList(
                new Person("Joe", 28, "Bp"),
                new Person("Jack", 14, "Bp"),
                new Person("Jill", 6, "Bp"),
                new Person("Jane", 5, "Bp"),
                new Person("Jim", 15, "Bp")
        ));
    }

    @Test
    void getStudentsTest() {
        List<Student> result = primarySchool.getStudents();

        assertEquals(2, result.size());
    }
}