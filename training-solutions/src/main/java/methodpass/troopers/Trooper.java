package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position;

    public Trooper(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        this.name = name;
        this.position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("The target position cannot be null");
        }
        this.position = target;
    }

    public double distanceFrom(Position target) {
        return position.distanceFrom(target);
    }
}
