package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ElectricityTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void electricityTest() throws IOException {

        Path path = temporaryFolder.newFile("powerOutages").toPath();
        new Electricity().writePowerOutagesToFile(path);
        List<String> assist = Files.readAllLines(path);

        assertEquals(5, assist.size());
        assertEquals("Ék utca", assist.get(1));
    }
}