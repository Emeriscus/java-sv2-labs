package inheritancemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void createCarWithValidDatasTest() {
        Car car = new Car(6.5, 50, 50);

        assertEquals(6.5, car.getFuelRate());
        assertEquals(50, car.getFuel());
        assertEquals(50, car.getTankCapacity());
    }

    @Test
    void createCarWithinValidDatasTest() {
        IllegalArgumentException expected = assertThrows(IllegalArgumentException.class,
                () -> new Car(6.5, 51, 50));

        assertEquals("Az üzemanyag nem lehet több, mint a tank kapacitása!", expected.getMessage());
    }

    @Test
    void modifyFuelAmountTest() {
        Car car = new Car(6.5, 35, 50);
        car.modifyFuelAmount(15);

        assertEquals(50, car.getFuel());
    }

    @Test
    void driveTest() {
        Car car = new Car(6.5, 35, 50);
        car.drive(150);

        assertEquals(25.25, car.getFuel());
    }

    @Test
    void calculateRefillAmountTest() {
        Car car = new Car(6.5, 35, 50);

        assertEquals(15, car.calculateRefillAmount());
    }
}