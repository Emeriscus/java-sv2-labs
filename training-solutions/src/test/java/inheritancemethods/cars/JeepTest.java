package inheritancemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {

    @Test
    void createJeepWithValidParamsTest() {
        Jeep jeep = new Jeep(6.5, 45, 60, 30, 30);

        assertEquals(6.5, jeep.getFuelRate());
        assertEquals(45, jeep.getFuel());
        assertEquals(60, jeep.getTankCapacity());
        assertEquals(30, jeep.getExtraCapacity());
        assertEquals(30, jeep.getExtraFuel());
    }

    @Test
    void createJeepWithinValidParamsTest() {
        IllegalArgumentException expected = assertThrows(IllegalArgumentException.class,
                () -> new Jeep(6.5, 45, 60, 30, 31));

        assertEquals("Az extra üzemanyag nem lehet több, mint extra üzemanyag tároló kapacitása!", expected.getMessage());
    }

    @Test
    void driveTest() {
        Jeep jeep = new Jeep(5, 45, 60, 30, 30);
        jeep.drive(100);

        assertEquals(25, jeep.getExtraFuel());
        assertEquals(45, jeep.getFuel());

        jeep.drive(600);
        assertEquals(0, jeep.getExtraFuel());
        assertEquals(40, jeep.getFuel());

        jeep.drive(200);
        assertEquals(0, jeep.getExtraFuel());
        assertEquals(30, jeep.getFuel());

        IllegalArgumentException exp = assertThrows(IllegalArgumentException.class,
                () -> jeep.drive(601));

        assertEquals("Nincs elég üzemanyag az út megtételéhez", exp.getMessage());
    }

    @Test
    void calculateRefillAmountTest() {
        Jeep jeep = new Jeep(6.5, 45, 60, 30, 20);

        assertEquals(25, jeep.calculateRefillAmount());
    }
}