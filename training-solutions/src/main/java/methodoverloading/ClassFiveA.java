package methodoverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ClassFiveA {

    private List<String> names = Arrays.asList("Gárdos Helga", "Joó Lilla", "Kiss József", "Nagy Béla",
            "Németh Dóra", "Pongrácz Imola", "Rendes Richárd", "Szabó Nóra", "Takács Júlia", "Vígh Elemér");

    public String getTodayReferringStudent(int number) {
        return names.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return names.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        for (Number actual : Number.values()) {
            if (actual.name().equals(numberName.toUpperCase())) {
                return names.get(actual.getValue() - 1);
            }
        }
        throw new IllegalArgumentException("The numbername doesn't exist");
    }
}
