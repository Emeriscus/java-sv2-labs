package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {

    public void readFile(Path path) {

        try {
            List<String> names = Files.readAllLines(path);
            System.out.println(getFirstDoctor(names));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Nem létező fájl, vagy útvonal.", ioe);
        }
        finally {
            System.out.println("End of reading.");
        }
    }

    public String getFirstDoctor(List<String> names){
        for (String actual: names){
            if (actual.contains("dr.")) {
                return actual;
            }
        }
        return "";
    }

    public static void main(String[] args) {

        Names names =new Names();

        Path path = Paths.get("src/main/resources/doctors.txt");
        Path path2 = Paths.get("src/main/resources/anotherDoctors.txt");
        Path path3 = Paths.get("src/main/resources/doc.txt");

        names.readFile(path);

        names.readFile(path2);

        names.readFile(path3);
    }
}
