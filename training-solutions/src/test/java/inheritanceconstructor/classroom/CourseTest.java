package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void createCourse() {
        Course course = new Course(50, Facility.COMPUTERS);

        assertEquals(Facility.COMPUTERS, course.getFacilityNeeded());
        assertEquals(50, course.getParticipants());
    }

}