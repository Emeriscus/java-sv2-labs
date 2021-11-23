package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public List<String> readFiles(Path path) {

        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Nem létező fájl, vagy útvonal.", ioe);
        }
    }

    public List<String> getBooksList(List<String> booksList) {

        List<String> result = new ArrayList<>();

        for (String actual : booksList) {
            String[] assist = actual.split(";");
            result.add(assist[2] + ": " + assist[1]);
        }
        return result;
    }

    public void writeBooksListToFile(Path path, List<String> booksList) {

        try {
            Files.write(path, booksList);

        } catch (IOException ioe) {
            throw new IllegalStateException("Nem létező fájl, vagy útvonal.", ioe);
        }
    }
}
