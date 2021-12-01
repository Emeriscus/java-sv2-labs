package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats examStats = new ExamStats(150);

    @Test
    void getNumberOfTopGradesTest() {
        int expected = examStats.getNumberOfTopGrades(60, 91, 90, 120, 150, 145, 60, 115);

        assertEquals(5, expected);
    }

    @Test
    void getNumberOfTopGradesWithNullResultsTest() {
        IllegalArgumentException expection = assertThrows(IllegalArgumentException.class,
                () -> examStats.getNumberOfTopGrades(60));

        assertEquals("The results cannot be empty", expection.getMessage());
    }

    @Test
    void hasAnyFailedTest() {
        boolean expected = examStats.hasAnyFailed(60, 91, 90, 120, 150, 145, 60, 115);

        assertTrue(expected);
    }

    @Test
    void hasAnyFailedWithNullResultsTest() {
        IllegalArgumentException expection = assertThrows(IllegalArgumentException.class,
                () -> examStats.hasAnyFailed(60));

        assertEquals("The results cannot be empty", expection.getMessage());
    }
}