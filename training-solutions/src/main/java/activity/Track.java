package activity;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public double getDistance() {
        double result = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            TrackPoint init = trackPoints.get(i);
            result += init.getDistanceFrom(trackPoints.get(i + 1));
        }
        return result;
    }


    public double getFullElevation() {
        double result = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getElevation() > trackPoints.get(i).getElevation()) {
                result += trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            }

        }
        return result;
    }

    public double getFullDecrease() {
        double result = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getElevation() < trackPoints.get(i).getElevation()) {
                result += Math.abs(trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation());
            }

        }
        return result;
    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = trackPoints.stream()
                .mapToDouble(trackPoint -> trackPoint.getCoordinate().getLatitude())
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Activities cannot be empty"));
        double minLongitude = trackPoints.stream()
                .mapToDouble(trackPoint -> trackPoint.getCoordinate().getLongitude())
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Activities cannot be empty"));

        return new Coordinate(minLatitude, minLongitude);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.stream()
                .mapToDouble(trackPoint -> trackPoint.getCoordinate().getLatitude())
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Activities cannot be empty"));
        double maxLongitude = trackPoints.stream()
                .mapToDouble(trackPoint -> trackPoint.getCoordinate().getLongitude())
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Activities cannot be empty"));

        return new Coordinate(maxLatitude, maxLongitude);
    }

    public double getRectangleArea() {
        return Math.abs(findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude()) *
                Math.abs(findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude());
    }

    public void loadFromGpx(Path path) {
        Coordinate coordinate = null;
        try {
            Scanner scanner = new Scanner(path);
            while (scanner.hasNext()) {
                String line = scanner.nextLine().trim();
                if (line.startsWith("<trkpt")) {
                    double lat = Double.parseDouble(line.substring(12, 22));
                    double lon = Double.parseDouble(line.substring(29, 39));
                    coordinate = new Coordinate(lat, lon);
                }
                if (line.startsWith("<ele")) {
                    double elevation = Double.parseDouble(line.substring(5, 10));
                    trackPoints.add(new TrackPoint(coordinate, elevation));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
