package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List books = new ArrayList<>();

    public List getBooks() {
        return books;
    }

    public Book getFirstBook(List books) {

        if (books == null) {
            throw new NullPointerException("Argument should not be null!");
        }
        if (books.size() == 0) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }

        Object o = books.get(0);
        if (!(o instanceof Book)) {
            throw new ClassCastException("Not a book");
        }
        return (Book) o;
    }

}
