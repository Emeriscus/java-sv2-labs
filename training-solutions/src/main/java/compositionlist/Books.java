package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    private List<String> titles = new ArrayList<>();

    public List<String> getTitles() {
        return titles;
    }

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        if (titles.contains(title)) {
            int resultIndex = titles.indexOf(title);
            titles.set(resultIndex, "'" + author + ": " + titles.get(resultIndex) + "'");
        }
    }

    public static void main(String[] args) {

        Books books = new Books();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány könyvet akarsz felvinni az adatbázisba?");
        int pieces = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < pieces; i++) {
            System.out.println("A(z) " + (i + 1) + ". könyv címe:");
            String title = scanner.nextLine();
            books.addBook(title);
 //           books.addBook(scanner.nextLine());
        }

        System.out.println("Add meg a könyv címét, amelyiknek el szeretnéd tárolni az íróját:");
        String title = scanner.nextLine();

        System.out.println("Add meg a címhez tartozó írót:");
        String author = scanner.nextLine();

        books.findBookAndSetAuthor(title, author);
        System.out.println(books.getTitles());



    }

}
