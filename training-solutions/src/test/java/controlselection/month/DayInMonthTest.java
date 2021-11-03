package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {
    DayInMonth dayInMonth = new DayInMonth();

    @Test
    void dayInMonthTest() {
        int result = dayInMonth.dayInMonth(1900, "Február");
        assertEquals(28, result);
    }
}
