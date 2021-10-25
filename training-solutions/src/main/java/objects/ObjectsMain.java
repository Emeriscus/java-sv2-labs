package objects;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {

        new Book();
        System.out.println(new Book());

        Book emptyBook;

//        System.out.println(emptyBook);

        emptyBook = null;
        System.out.println(emptyBook);

        System.out.println(emptyBook == null);

        Book book = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book = anotherBook);

        anotherBook = book;
        System.out.println(anotherBook);

        System.out.println(book == anotherBook);

        System.out.println();
        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> books2 = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> books3= new ArrayList<>();

        books3.add(new Book());
        books3.add(new Book());
        books3.add(new Book());

        System.out.println(Arrays.toString(books));
        System.out.println(books2.toString());
        System.out.println(books3.toString());

        }
}
