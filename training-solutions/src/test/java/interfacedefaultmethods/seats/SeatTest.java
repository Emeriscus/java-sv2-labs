package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void familyCarTest() {

        Seat familyCar = new FamilyCar();

        assertEquals(5, familyCar.getNumberOfSeats());
    }

    @Test
    void sportsCarTest() {

        Seat sportsCar = new SportsCar();

        assertEquals(2, sportsCar.getNumberOfSeats());
    }

    @Test
    void carTest() {

        Seat car = new Car("Seat", 3);

        assertEquals(3, car.getNumberOfSeats());
    }
}