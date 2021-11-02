package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Run {

    private String name;
    private List<Double> distancesOfRuns;

    public Run(String name) {
        this.name = name;
        this.distancesOfRuns = new ArrayList<>();
    }

    public void addRun(double km) {
        distancesOfRuns.add(km);
    }

    public void printFormattedRunText() {

        int i = distancesOfRuns.size();
        double km = distancesOfRuns.get(distancesOfRuns.size() - 1);

        String s = String.format(new Locale("hu", "HU"),"Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %6.2f km-t futottál. Csak így tovább!"
                , name, LocalDate.now().toString(), i, km);
        System.out.println(s);
        }

    public static void main(String[] args) {

        Run run = new Run("Telek Jetti");
        run.addRun(8);
        run.addRun(8.6);
        run.addRun(9.1);
        run.addRun(11.3);

        run.printFormattedRunText();
    }
}
