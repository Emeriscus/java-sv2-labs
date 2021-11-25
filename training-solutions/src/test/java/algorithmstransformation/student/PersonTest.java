package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void createPersonTest() {

        Person person = new Person("Joe", 42, "Bp");

        assertEquals(42, person.getAge());
        assertEquals("Bp", person.getAddress());
        assertEquals("Joe", person.getName());
    }
}
