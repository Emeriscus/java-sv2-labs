package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstLetter {

    List<String> words = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FirstLetter firstLetter = new FirstLetter();

        firstLetter.addWord("Peti");
        firstLetter.addWord("Józsi");
        firstLetter.addWord("Erzsi");
        firstLetter.addWord("Dávid");
        firstLetter.addWord(null);

        try {
            for (String actual : firstLetter.words) {
                System.out.println(actual.charAt(0));
            }
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }
    }

    public void addWord(String word) {
        words.add(word);
    }
}
