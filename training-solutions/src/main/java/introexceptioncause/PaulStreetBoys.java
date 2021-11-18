package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public List<String> readFile(Path path) {

        try {
            return Files.readAllLines(path);

        } catch (IOException ioe) {
            throw new IllegalStateException("Nem létező fájl, vagy útvonal.", ioe);
        }
    }

    public String printFile(List<String> listOfNames) {
        StringBuilder sb = new StringBuilder();
        for (String actual : listOfNames) {
            if (!("Nemecsek Ernő".equals(actual))) {
                sb.append(actual + "\r\n");
            } else {
                sb.append(actual.toLowerCase() + "\r\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Path path = Paths.get("src/main/resources/palutcaifiuk.txt");

        try {

        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();

        System.out.println(paulStreetBoys.printFile(paulStreetBoys.readFile(path)));

        } catch (IllegalStateException ise){
            System.out.println(ise.getMessage());
            System.out.println(ise.getCause().getMessage());
        }

    }
}
