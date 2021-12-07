package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private static final int MAX_DAMAGE = 10;
    private static final int MAX_DEFENSE = 5;
    private Point position;
    private int hitPoint = 100;
    private Random rnd;

    public boolean isAlive() {
        return hitPoint > 0;            // lehet, hogy if-else-zel kell
    }

    protected int getActualPrimaryDamage() {
        return rnd.nextInt(MAX_DAMAGE) + 1;
    }

    private int getActualDefence() {
        return rnd.nextInt(MAX_DEFENSE + 1);
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    abstract public void secondaryAttack(Character enemy);      // lehet public abstract void is!

    public Character(Point position, Random rnd) {
        this.position = position;
        this.rnd = rnd;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRnd() {
        return rnd;
    }
}
