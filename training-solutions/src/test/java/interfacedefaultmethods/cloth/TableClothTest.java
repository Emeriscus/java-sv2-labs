package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void tableClothTest() {

        TableCloth tableCloth = new TableCloth(5);

        assertEquals(4, tableCloth.getNumberOfSides());
        assertEquals(7.0710, tableCloth.getLengthOfDiagonal(), 0.0005);
        assertEquals(20, tableCloth.getPerimeter());
        assertEquals(25, tableCloth.getArea());
    }
}