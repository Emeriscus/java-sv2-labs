package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {

        try {
            List<String> holidayStuffs = Files.readAllLines(Paths.get("holiday_.txt"));
            System.out.println(holidayStuffs);
        } catch (IOException ioe) {
            System.out.println("Nem létező fájl, vagy útvonal.");
            ioe.printStackTrace();
        }
    }


}
