package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random rnd;

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return rnd.nextInt(1, 11);
    }

    private int getActualDefence() {
        return rnd.nextInt(6);
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

    abstract public void secondaryAttack(Character enemy);

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
