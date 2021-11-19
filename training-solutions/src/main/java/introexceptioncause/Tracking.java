package introexceptioncause;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Tracking {

    public static void main(String[] args) {

        TrackPoints trackPoints=new TrackPoints();
        Path path= Paths.get("src/main/resources/tracking.csv");

        try {
            trackPoints.printHeightDifferences(trackPoints.getHeightDatasFromFile(trackPoints.readFile(path)));

        }catch (IllegalStateException ise){
            System.out.println(ise.getMessage());
            System.out.println(ise.getCause().getMessage());
        }
    }
}
