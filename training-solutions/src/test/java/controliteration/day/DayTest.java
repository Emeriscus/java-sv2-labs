package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest {
    Day day = new Day();
    @BeforeEach
    void init(){

        day.addHour(new Hour(2));
        day.addHour(new Hour(6));
        day.addHour(new Hour(23));
        day.addHour(new Hour(8));
        day.addHour(new Hour(16));
    }


    @Test
    void daytest() {

        day.setDayPeriod();

        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(1).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(2).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(3).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(4).getPeriod());
    }

}
