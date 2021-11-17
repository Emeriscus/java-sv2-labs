package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    void StudentTest() {

        student.addNote(5);
        student.addNote(1);
        assertEquals(2, student.getNotes().size());
        assertEquals(5, student.getNotes().get(0));

    }

    @Test
    void StudentWithWrongNoteTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> student.addNote(0));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception2.getMessage());
    }
}