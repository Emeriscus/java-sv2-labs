package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.nio.charset.CharacterCodingException;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    @Test
    void createArcherTest() {
        Archer archer = new Archer(new Point(23, 42), new Random());

        assertEquals(23, archer.getPosition().getX());
        assertEquals(42, archer.getPosition().getY());
        assertEquals(100, archer.getHitPoint());
    }

    @Test
    void secondaryAttackTest() {
        Random rnd = new Random(10);

        Archer archer = new Archer(new Point(23, 42), rnd);
        Character enemy = new Archer(new Point(15, 30), rnd);
        archer.secondaryAttack(enemy);

        assertEquals(99, archer.getNumberOfArrow());
        assertTrue(enemy.getHitPoint() >= 96);
    }
}