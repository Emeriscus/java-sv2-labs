package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private static final int MAX_ARROWS = 100;
    private static final int MAX_SECONDARY_DAMAGE = 5;
    private int numberOfArrow;

    public Archer(Point position, Random rnd) {
        super(position, rnd);
        this.numberOfArrow = MAX_ARROWS;
    }

    private int getActualSecondaryDamage() {
        return getRnd().nextInt(MAX_SECONDARY_DAMAGE) + 1;
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
