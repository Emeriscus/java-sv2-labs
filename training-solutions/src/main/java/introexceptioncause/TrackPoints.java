package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readFile(Path path) {

        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Nem létező fájl, vagy útvonal.", ioe);
        }
    }

    public List<Integer> getHeightDatasFromFile(List<String> trackDatas) {
        List<Integer> heightsData = new ArrayList<>();
        for (String actual : trackDatas) {
            String[] temp = actual.split(";");
            heightsData.add(Integer.parseInt(temp[2]));
        }
        return heightsData;
    }

    public void printHeightDifferences(List<Integer> heightsData) {
        for (int i = 0; i < heightsData.size()-1; i++) {
            System.out.println(heightsData.get(i+1)-heightsData.get(i));
        }
    }

}



