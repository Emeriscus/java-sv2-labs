package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az írót és a könyv címét:");
        Book book = new Book(scanner.nextLine(), scanner.nextLine());
        book.register("17000");

        System.out.println();
        System.out.println("Az író: " + book.getAuthor());
        System.out.println("A cím: " + book.getTitle());
        System.out.println("Regisztráció szám: " + book.getRegNumber());

    }
}
