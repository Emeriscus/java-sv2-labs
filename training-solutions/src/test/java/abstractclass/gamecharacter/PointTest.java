package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void createPointTest() {
        Point point = new Point(12, 34);

        assertEquals(12, point.getX());
        assertEquals(34, point.getY());
    }

    @Test
    void distanceTest() {
        Point point = new Point(12, 34);
        Point anotherPoint = new Point(9, 30);
        long expected = point.distance(anotherPoint);

        assertEquals(5, expected);
    }
}