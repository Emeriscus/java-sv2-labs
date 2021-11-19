package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Words {

    public String getFirstWordWithA(Path path) {

        for (String actual : readFiles(path)) {
            if (actual.startsWith("A")) {
                return actual;
            }
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
