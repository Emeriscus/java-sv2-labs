package activity;

public class Coordinate {

    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if (coordinateValidator(latitude, longitude)) {
            this.latitude = latitude;
            this.longitude = longitude;
        } else {
            throw new IllegalArgumentException("The coordinates are not valid");
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public boolean coordinateValidator(double latitude, double longitude) {
        return latitude <= 90.0 && latitude >= -90.0 && longitude <= 180.0 && longitude >= -180.0;
    }
}
