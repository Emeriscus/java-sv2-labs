package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {

        Performance performance = new Performance("Aurora", LocalDate.of(2021, 10, 02), LocalTime.of(22, 0), LocalTime.of(23, 55));

        System.out.println(performance.getInfo());
    }
}
