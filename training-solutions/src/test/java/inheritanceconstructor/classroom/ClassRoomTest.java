package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void createClassRoomTest() {
        ClassRoom classRoom = new ClassRoom("1. em", 150, Facility.PROJECTOR);

        assertEquals("1. em", classRoom.getLocation());
        assertEquals(150, classRoom.getCapacity());
        assertEquals(Facility.PROJECTOR, classRoom.getFacility());
    }

    @Test
    void isSuitableTest() {
        ClassRoom classRoom = new ClassRoom("2. em", 200, Facility.CHALKBOARD);
        Course course = new Course(200, Facility.CHALKBOARD);
        Course course1 = new Course(201, Facility.CHALKBOARD);
        Course course2 = new Course(150, Facility.COMPUTERS);
        Course course3 = new Course(201, Facility.COMPUTERS);

        assertTrue(classRoom.isSuitable(course));
        assertFalse(classRoom.isSuitable(course1));
        assertFalse(classRoom.isSuitable(course2));
        assertFalse(classRoom.isSuitable(course3));
    }
}