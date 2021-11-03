package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Aurora", 1990, 100.55);
    }

    @Test
    void testName() {
        assertEquals("Aurora", ship.getName());
        assertNotEquals("free", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1990, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1990);
        assertFalse(ship.getYearOfConstruction() == 0);
    }

    @Test
    void testLength() {
        assertEquals(100.55, ship.getLength(), 0.0001);
    }

    @Test
    void testNull() {
        Ship shipNew = new Ship(null, 0, 0);

        assertNull(shipNew.getName());
        assertNotNull(ship.getName());
    }

    @Test
    void testSameObjects() {
        Ship shipNew = ship;

        assertSame(shipNew, ship);
    }

    @Test
    void testNotSameObjects() {
        Ship shipNew = new Ship("Aurora", 1990, 100.55);

        assertNotSame(shipNew, ship);
    }
}
