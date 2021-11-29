package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    @Test
    void createValidMonumnetTest() {

        Monument monument = new Monument("Car", "Tipo", LocalDate.of(2020, 12, 23), "1231");

        assertEquals("1231", monument.getRegNumber());
        assertEquals("Car", monument.getName());
        assertEquals("Tipo", monument.getTitle());
        assertEquals(LocalDate.of(2020, 12, 23), monument.getDateOfRegistry());
    }

    @Test
    void createMonumentInvalidNameTest() {
        IllegalArgumentException expected = assertThrows(IllegalArgumentException.class,
                () -> new Monument("  ", "Tipo", LocalDate.of(2020, 12, 23), "1231"));
        assertEquals("The name cannot be empty!", expected.getMessage());
    }

    @Test
    void createMonumentInvalidTitleTest() {
        IllegalArgumentException expected = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Car", null, LocalDate.of(2020, 12, 23), "1231"));
        assertEquals("The title cannot be empty!", expected.getMessage());
    }

    @Test
    void createMonumentInvalidRegNumberTest() {
        IllegalArgumentException expected = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Car", "Tipo", LocalDate.of(2020, 12, 23), "  "));
        assertEquals("The registry number cannot be empty!", expected.getMessage());
    }

    @Test
    void createMonumentInvalidDateOfRegistryTest() {
        IllegalArgumentException expected = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Car", "Tipo", LocalDate.of(2021, 11, 30), "1234"));
        assertEquals("The date of registry cannot be after now!", expected.getMessage());
    }
}