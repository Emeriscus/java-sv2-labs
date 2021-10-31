package stringbasic.characters;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a betűzendő szót:");
        String word = scanner.nextLine();

        System.out.println("A követkeező szót kell betűnként beírni a konzolra: " + word);
        char[] chars = new char[word.length()];
        for (int i = 1; i <= word.length(); i++) {
            System.out.println(i + ":");
            chars[i - 1] = scanner.nextLine().charAt(0);
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println(chars);

        String wordResult = new String(chars);
        if (word.equals(wordResult)) {
            System.out.println("A megoldás helyes!");
        } else {
            System.out.println("A megoldás rossz!");
        }

    }
}
