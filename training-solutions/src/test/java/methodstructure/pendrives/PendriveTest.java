package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PendriveTest {

    Pendrive pendrive = new Pendrive("Kingston", 16, 3000);

    @Test
    void risePriceTest() {
        pendrive.risePrice(15);

        assertEquals(3450, pendrive.getPrice());
    }

    @Test
    void comparePricePerCapacityTest() {
        Pendrive otherPendrive = new Pendrive("Maxell", 16, 2500);
        int result = pendrive.comparePricePerCapacity(otherPendrive);

        assertEquals(1, result);
    }

    @Test
    void isCheaperThanTest() {
        Pendrive otherPendrive = new Pendrive("Maxell", 16, 2500);

        assertFalse(pendrive.isCheaperThan(otherPendrive));
    }
}