package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.println("Kérek egy maximum ötbetűs szót:");
        word = scanner.nextLine();

        for (char actual: word.toCharArray()){
            if ((!Character.isAlphabetic(actual)) && word.length()>5){
                throw new IllegalArgumentException(" A szó több mint öt betű, ráadásul nem csak betűkből áll: " + word);
            }
        }

        if (word.length()>5){
            throw new IllegalArgumentException("A szó több mint öt betű: " + word);
        }

        for (char actual: word.toCharArray()){
            if (!Character.isAlphabetic(actual)){
                throw new IllegalArgumentException(" A szó nem csak betűkből áll: " + word);
            }
        }

        System.out.println(word);
    }
}
