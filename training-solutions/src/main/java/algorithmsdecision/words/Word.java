package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> words, String word) {
        boolean result = false;

        for (String actual : words) {
            if (actual.length() > word.length()) {
                result = true;
            }
        }
        return result;
    }
}
