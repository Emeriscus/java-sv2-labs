package abstractclass.gamecharacter;

public class Point {

    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point anotherPoint) {

        return (long) Math.sqrt((x - anotherPoint.getX()) * (x - anotherPoint.getX()) + (y - anotherPoint.getY()) * (y - anotherPoint.getY()));
    }
}
