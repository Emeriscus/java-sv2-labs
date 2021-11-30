package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrooperTest {

    @Test
    void createTrooperTest() {
        Trooper trooper = new Trooper("Joe");

        assertEquals("Joe", trooper.getName());
        assertEquals(0, trooper.getPosition().getPosX());
        assertEquals(0, trooper.getPosition().getPosY());
    }

    @Test
    void createTrooperNullNameTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Trooper(null));

        assertEquals("Name cannot be empty!", exception.getMessage());
    }

    @Test
    void changeValidPositionTest() {
        Trooper trooper = new Trooper("Joe");

        trooper.changePosition(new Position(2, 3.5));
        assertEquals(2, trooper.getPosition().getPosX());
        assertEquals(3.5, trooper.getPosition().getPosY());
    }

    @Test
    void changeNullPositionTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Trooper("Joe").changePosition(null));

        assertEquals("The target position cannot be null", exception.getMessage());
    }

    @Test
    void distanceFromTest() {
        Trooper trooper = new Trooper("Joe");

        trooper.distanceFrom(new Position(6.5, 4));
        assertEquals(7.6321, trooper.distanceFrom(new Position(6.5, 4)), 000001);
    }
}
