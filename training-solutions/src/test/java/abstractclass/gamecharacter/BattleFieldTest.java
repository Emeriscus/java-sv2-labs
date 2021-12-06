package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {

    @Test
    void fightTest() {

        BattleField battleField = new BattleField();
        Character archer = new Archer(new Point(21, 20), new Random());
        Character axeWarrior = new AxeWarrior(new Point(10, 2), new Random());

        battleField.fight(archer, axeWarrior);

        assertTrue(archer.isAlive());
        assertFalse(axeWarrior.isAlive());
    }

    @Test
    void closeInFightTest() {

        BattleField battleField = new BattleField();
        Character archer = new Archer(new Point(21, 20), new Random());
        Character axeWarrior = new AxeWarrior(new Point(20, 20), new Random());

        battleField.fight(archer, axeWarrior);

        assertTrue(!archer.isAlive() || !axeWarrior.isAlive());
    }

}