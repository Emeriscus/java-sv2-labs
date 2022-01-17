package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    public Aid(int amount) {
        this.amount = amount;
    }

    private int amount;

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);

            for (String actual : lines) {
                String[] parts = actual.split(": ");
                result.add(parts[0] + ": " + amount / Integer.parseInt(parts[1]));
            }
        } catch (IOException | NullPointerException
                | IndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }
        return result;
    }
}
