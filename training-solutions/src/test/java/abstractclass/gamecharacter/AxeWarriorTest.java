package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AxeWarriorTest {

    @Test
    void createAxeWarriorTest() {
        AxeWarrior axeWarrior = new AxeWarrior(new Point(12, 24), new Random());

        assertEquals(12, axeWarrior.getPosition().getX());
        assertEquals(24, axeWarrior.getPosition().getY());
        assertTrue(axeWarrior.isAlive());
        assertEquals(100, axeWarrior.getHitPoint());

    }

    @Test
    void secondaryAttackTest() {
        AxeWarrior axeWarrior = new AxeWarrior(new Point(12, 24), new Random());
        Character enemy = new Archer(new Point(12, 23), new Random());

        assertTrue(axeWarrior.getPosition().distance(enemy.getPosition()) < 2);
        axeWarrior.secondaryAttack(enemy);

        assertTrue(enemy.getHitPoint() >= 80);


    }
}