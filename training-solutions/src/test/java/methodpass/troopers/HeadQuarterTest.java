package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeadQuarterTest {

    HeadQuarter headQuarter = new HeadQuarter();

    @Test
    void addTrooperTest() {
        Trooper trooper = new Trooper("John");
        headQuarter.addTrooper(trooper);

        assertEquals("John", headQuarter.getTroopers().get(0).getName());
        assertEquals(0, headQuarter.getTroopers().get(0).getPosition().getPosX());
        assertEquals(0, headQuarter.getTroopers().get(0).getPosition().getPosY());
    }

    @Test
    void moveTrooperByNameTest() {
        Trooper trooper = new Trooper("John");
        Trooper trooper2 = new Trooper("Jim");
        Trooper trooper3 = new Trooper("Jack");
        headQuarter.addTrooper(trooper);
        headQuarter.addTrooper(trooper2);
        headQuarter.addTrooper(trooper3);

        headQuarter.moveTrooperByName("Jim", new Position(3, 5.5));

        assertEquals(3, headQuarter.getTroopers().get(1).getPosition().getPosX());

    }

    @Test
    void moveClosestTrooperTest() {
        Trooper trooper = new Trooper("John");
        Trooper trooper2 = new Trooper("Jim");
        Trooper trooper3 = new Trooper("Jack");
        headQuarter.addTrooper(trooper);
        headQuarter.addTrooper(trooper2);
        headQuarter.addTrooper(trooper3);

        headQuarter.getTroopers().get(2).changePosition(new Position(2, 3));
        headQuarter.getTroopers().get(0).changePosition(new Position(1, 1));

        headQuarter.moveClosestTrooper(new Position(3, 4));

        assertEquals(3, headQuarter.getTroopers().get(2).getPosition().getPosX());
        assertEquals(4, headQuarter.getTroopers().get(2).getPosition().getPosY());
    }
}