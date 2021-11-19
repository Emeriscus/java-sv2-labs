package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {

        List<String> pathHomeTo = Arrays.asList("Szolnok", "Szajol", "Fegyvernek", "Kenderes", "Karcag");

        try {
            Files.write(Paths.get("roadmap.txt"), pathHomeTo);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
