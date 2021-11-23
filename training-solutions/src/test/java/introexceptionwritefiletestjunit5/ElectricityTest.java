package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    Electricity electricity = new Electricity();

    @TempDir
    File temporaryfolder;

    @Test
    void writePowerOutagesToFileTest() throws IOException {

        Path path = temporaryfolder.toPath().resolve("writePowerOutagesToFile.txt");

        electricity.writePowerOutagesToFile(path);
        List expected = Files.readAllLines(path);

        assertEquals(5, expected.size());
        assertEquals("Morzsa utca", expected.get(3));
    }

}