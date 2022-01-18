package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings = new Siblings();

    @Test
    void getFullNamesWithExistingFileTest() {
        List<String> expected = Arrays.asList("Szabó Emese", "Szabó Ferenc");
        Path path = Path.of("src/test/resources/firstNames.txt");

        List<String> result = siblings.getFullNames("Szabó", path);

        assertEquals(expected, result);
    }

    @Test
    void getFullNamesWithInvalidFileTest() {
        Path path = Path.of("src/test/resources/firstName.txt");

        Exception expected = assertThrows(IllegalArgumentException.class,
                () -> siblings.getFullNames("Szabó", path));

        assertEquals("File not found", expected.getMessage());
    }

}