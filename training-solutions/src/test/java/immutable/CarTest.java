package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void createValidCarTest() {

        Car car = new Car("BMW", "E6", 2021);

        assertEquals(2021, car.getYearOfProduct());
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
                () -> new Car("BMW", "E4", 2022));
        assertEquals("Invalid year of product!", exception3.getMessage());
    }
}