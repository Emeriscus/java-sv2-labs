package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private int numberOfArrow = 100;

    public Archer(Point position, Random rnd) {
        super(position, rnd);
    }

    private int getActualSecondaryDamage() {
        return getRnd().nextInt(1, 6);
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }
}
