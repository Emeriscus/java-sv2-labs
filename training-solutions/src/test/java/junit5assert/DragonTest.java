package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void Testname() {
        Dragon dragon = new Dragon("Süsü",1, 100.3);

        assertEquals("Süsü", dragon.getName());

        assertNotEquals("Babóca", dragon.getName());
    }
    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü",1, 100.3);

        assertEquals(1, dragon.getNumberOfHeads());

        assertTrue(dragon.getNumberOfHeads() == 1);

        assertFalse(dragon.getNumberOfHeads() == 0);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Süsü",1, 100.3);

        assertEquals(100.3, dragon.getHeight(), 0.0005);
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("Süsü",1, 100.3);
        Dragon dragon1 = new Dragon(null, 0, 0);

        assertNull(dragon1.getName());

        assertNotNull(dragon.getName());
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Süsü",1, 100.3);
        Dragon dragonNew = dragon;

        assertSame(dragonNew, dragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Süsü",1, 100.3);
        Dragon dragonNew = new Dragon("Süsü",1, 100.3);

        assertNotSame(dragonNew, dragon);
    }

}
