package constructoroverloading.bus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firsthour, int lastHour, int everyMinute) {

        for (int i = firsthour; i <= lastHour; i++) {
            for (int j = everyMinute; j < 60; j += everyMinute) {
                timeTable.add(new SimpleTime(i, j));
            }
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual) {

        for (SimpleTime result : timeTable) {
            if (result.getDifference(actual) > 0) {
                return result;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }
}
