package attributes.book;

import attributes.book.Book;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Cujo");

        System.out.println(book.getTitle());

        book.setTitle("Firestarter");
        System.out.println(book.getTitle());
    }


}
