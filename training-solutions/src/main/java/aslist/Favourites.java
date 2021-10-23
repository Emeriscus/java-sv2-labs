package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {

        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a kedvenc színed?");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Mi a kedvenc filmed?");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Mi a kedvenc ételed?");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Mi a kedvenc italod?");
        favouriteThings.add(scanner.nextLine());

        System.out.println();
        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings.toString());

    }





}
