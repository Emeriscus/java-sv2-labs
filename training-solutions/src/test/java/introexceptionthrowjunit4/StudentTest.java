package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student();

    @Test
    public void StudentTest() {
        student.addNote(5);
        assertEquals(1, student.getNotes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStudentWithIllegalNote() {
        student.addNote(6);
    }

    @Rule
    public ExpectedException e = ExpectedException.none();

    @Test
    public void testStudentWithAnotherIllegalNote() {
        e.expect(IllegalArgumentException.class);
        e.expectMessage("Note must be between 1 and 5!");
        student.addNote(0);
    }

    @Test
    public void testStudentWithBrandNewAnotherIllegalNote() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> student.addNote(9));
        assertEquals("Note must be between 1 and 5!", e.getMessage());
    }

}