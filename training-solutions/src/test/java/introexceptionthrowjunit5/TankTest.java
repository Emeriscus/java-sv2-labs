package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank = new Tank();

    @Test
    void tankTest() {
        tank.modifyAngle(25);
        tank.modifyAngle(30);
        assertEquals(55, tank.getAngle());
    }

    @Test
    void tankWithBadAngleTest() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(81));
        assertEquals("A tank csöve nem tud ennyire elfordulni!", exception.getMessage());
    }

    @Test
    void tankWithAnotherBadAngleTest() {

        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(-81));
        assertEquals("A tank csöve nem tud ennyire elfordulni!", exception2.getMessage());
    }
}
