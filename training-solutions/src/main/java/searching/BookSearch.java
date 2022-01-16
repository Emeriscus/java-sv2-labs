package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if (author == null || author.isBlank() || title == null || title.isBlank()) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }

        int result = Collections.binarySearch(books, new Book(1, author, title));
        if (result < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        } else {
            return books.get(result);
        }
    }
}
