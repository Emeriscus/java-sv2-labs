package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile() throws IOException {

        return Files.readAllLines(Paths.get("underground.txt"));
    }

    public String getDailySchedule(List<String> metroCarsData) {
        StringBuilder sb = new StringBuilder(LocalDate.now().toString() + ",");
        for (String actual : metroCarsData) {
            if (actual.startsWith("2")) {
                sb.append(" " + actual);
            }
        }
        return sb.toString();
    }
}
