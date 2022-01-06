package exceptions.measurement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Measurement measurement;
    List<String> measured;

    @BeforeEach
    void setUp() {
        measurement = new Measurement();
        measured = measurement.readFromFile(Paths.get("src/test/resources/measurementdata.csv"));
    }

    @Test
    void testReadFromFile() {
        assertEquals(11, measured.size());
        assertEquals(true, measured.get(0).startsWith("1"));
        assertEquals(true, measured.get(8).endsWith("oe"));
    }

    @Test
    void testReadFromNotExistingFile() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> measurement.readFromFile(Paths.get("src/test/resources/measurementdat_.csv")));
        assertEquals("Cannot read file", ex.getMessage());
    }

    @Test
    void testValidate() {
        List<String> faultLines = measurement.validate(measured);

        assertEquals(8, faultLines.size());
        assertEquals("2,12.4,John Doe,a", faultLines.get(0));
        assertEquals("9,12.4,", faultLines.get(7));
    }
}