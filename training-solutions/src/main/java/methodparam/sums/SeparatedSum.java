package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatedSum {


    public Sums sum(String floatingNumbers) {
        List<Double> doubles = stringListToDouble(separateNumbers(readFromFile()));
        double sumPositives = 0;
        double sumNegatives = 0;

        for (Double actual : doubles) {
            if (actual.toString().startsWith("-")) {
                sumNegatives += actual;
            } else {
                sumPositives += actual;
            }
        }
        Sums sums = new Sums(sumPositives, sumNegatives);
        return sums;
    }

    public String readFromFile() {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt"));
            return lines.get(0);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file!", ioe);
        }
    }

    private List<String> separateNumbers(String floatingNumbers) {
        List<String> numbers = new ArrayList<>(Arrays.asList(floatingNumbers.toString().split(";")));
        return numbers;
    }

    private List<Double> stringListToDouble(List<String> separateNumbers) {
        List<Double> doubles = new ArrayList<>();

        for (String actual : separateNumbers) {
            doubles.add(Double.parseDouble(actual.replace(',', '.')));
        }
        return doubles;
    }
}
