package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void createValidCarTest() {

        Car car = new Car("BMW", "E6", LocalDate.now().getYear());

        assertEquals(LocalDate.now().getYear(), car.getYearOfProduct());
        assertEquals("BMW", car.getBrand());
        assertEquals("E6", car.getType());
    }

    @Test
    void createInvalidCarTest() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Car(null, "E4", 2001));
        assertEquals("The brand is not valid!", exception.getMessage());

        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class,
                () -> new Car("  ", "E4", 2001));
        assertEquals("The brand is not valid!", exception2.getMessage());

        IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class,
                () -> new Car("BMW", "E4", LocalDate.now().getYear() + 1));
        assertEquals("Invalid year of product!", exception3.getMessage());
    }
}