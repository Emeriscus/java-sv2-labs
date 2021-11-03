package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {

    @Test
    void dayOfWeeksTest() {

        DayOfWeeks dayOfWeeks = new DayOfWeeks();

        String s = dayOfWeeks.dayOfWeek("hétfő");

        assertEquals("hét eleje", s);


    }

}
