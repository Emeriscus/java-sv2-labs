package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    private List<String> powerOutages = new ArrayList<>();

    public List<String> createPowerOutages() {
        powerOutages.add(LocalDate.now().toString());
        powerOutages.add("Ék utca");
        powerOutages.add("Gyökér utca");
        powerOutages.add("Morzsa utca");
        powerOutages.add("Palota út");
        return powerOutages;
    }

    public void writePowerOutagesToFile(Path path) {

        try {
            Files.write(path, createPowerOutages());
        } catch (IOException ioe) {
            throw new IllegalStateException("Nem létező fájl, vagy útvonal.", ioe);
        }
    }
}
