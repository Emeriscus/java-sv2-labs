package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Az író neve: ");
        String author = scanner.nextLine();

        System.out.println("A könyv címe: ");
        String title = scanner.nextLine();

        Book book = new Book(author, title);
        book.register("17000");

        System.out.println();
        System.out.println("Az író: " + book.getAuthor());
        System.out.println("A cím: " + book.getTitle());
        System.out.println("Regisztrációs szám: " + book.getRegNumber());

    }
}
