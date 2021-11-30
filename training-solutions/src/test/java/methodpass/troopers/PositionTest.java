package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void distanceFromTest() {
        Position position1 = new Position(3, 5.5);
        Position position2 = new Position(6.5, 4);

        assertEquals(3.80788, position1.distanceFrom(position2), 0.00001);
    }
}