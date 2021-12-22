package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    public static final long ALTITUDE = 10;

    public AstroBoy(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    public long getAltitude() {
        return position.getZ();
    }

    @Override
    public void liftTo(long altitude) {
        this.position = new Point(this.position.getX(), this.position.getY(), altitude);
        path.add(this.position);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        flyTo(position);
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    public void walkTo(Point position) {
        this.position = position;
        this.path.add(position);
    }

    public void flyTo(Point position) {
        this.position = new Point(position.getX(), position.getY(), ALTITUDE);
        this.path.add(this.position);
    }
}
