package introexceptionwritefiletestjunit4;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

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
