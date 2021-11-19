package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Words {

    public String getFirstWordWithA(Path path) {
        try {
            for (String actual : readFiles(path)) {

                if (actual.startsWith("A")) {
                    return actual;
                }
            }

        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            System.out.println(ise.getCause().getMessage());
        }
        return "A";
    }

    private List<String> readFiles(Path path) {

        try {
            return Files.readAllLines(path);

        } catch (IOException ioe) {
            throw new IllegalStateException("Nem létező fájl, vagy útvonal.", ioe);
        }
    }
}
