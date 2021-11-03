package controlselection.consonant;

public class ToConsonant {

    public char toconsonant(char letter) {
        String s = "aeiou";

        if (s.indexOf(letter) >= 0) {
            letter = (char) (letter + 1);
        }
        return letter;

    }
}
