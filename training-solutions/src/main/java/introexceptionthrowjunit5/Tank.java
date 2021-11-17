package introexceptionthrowjunit5;

public class Tank {

    private int angle = 0;

    void modifyAngle(int angleNumber) {
        angle += angleNumber;
        if (angle > 80 || angle < -80) {
            throw new IllegalArgumentException("A tank csöve nem tud ennyire elfordulni!");
        }
    }

    public int getAngle() {
        return angle;
    }
}
