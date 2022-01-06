package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {

        try {
            return Files.readAllLines(path);

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public List<String> validate(List<String> lines) {

        List<String> faultLines = new ArrayList<>();

        for (String actual : lines) {
            String[] parts = lineSplitter(actual);

            if (!isValidPartsLenght(parts)
                    || !isValidSerialNumber(parts[0])
                    || !isValidMeasuredData(parts[1])
                    || !isValidName(parts[2])) {

                faultLines.add(actual);
            }
        }
        return faultLines;
    }

    private String[] lineSplitter(String line) {
        return line.split(",");
    }

    private boolean isValidPartsLenght(String[] parts) {
        return parts.length == 3;
    }

    private boolean isValidName(String part) {
        return part.contains(" ");
    }

    private boolean isValidSerialNumber(String part) {
        try {
            Integer.parseInt(part);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean isValidMeasuredData(String part) {
        try {
            Double.parseDouble(part);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
