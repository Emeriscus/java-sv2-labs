package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song favoriteSong = new Song();

        System.out.println("Mi a kedvenc zeneszámod? ");
        favoriteSong.title = scanner.nextLine();
        System.out.println("Ki játssza ezt a számot? ");
        favoriteSong.band = scanner.nextLine();
        System.out.println("Milyen hosszú a szám egész percben? ");
        favoriteSong.length = scanner.nextInt();

        System.out.println("A kedvenc zeneszámod: " + favoriteSong.band + " - " + favoriteSong.title + " (" + favoriteSong.length + " perc)");

    }
}
