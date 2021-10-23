package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");

        List<String> sixChars = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == 6) {
                sixChars.add(words.get(i));
            }
        }
        System.out.println(sixChars.toString());


    }

}
