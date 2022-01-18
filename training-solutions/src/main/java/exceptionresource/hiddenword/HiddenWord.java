package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            return getWord(scanner);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("File not found", ioe);
        }
    }

    private String getWord(Scanner scanner) {
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            char result = hiddenChar(scanner.nextLine());
            sb.append(result);
        }
        return sb.toString();
    }

    private char hiddenChar(String line) {
        for (char actual : line.toCharArray()) {
            if (Character.isLetter(actual)) {
                return actual;
            }
        }
        return ' ';
    }
}
