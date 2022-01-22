package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Read {

    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        List<String> titles = books.stream()
                .filter(book -> book.getPages() < maxNumberOfPages)
                .map(book -> book.getTitle())
                .collect(Collectors.toList());
        return titles;
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {

        List<String> titles = books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());
        return titles;
    }

    public List<String> listAuthors() {

        List<String> authors = books.stream()
                .map(book -> book.getAuthor())
                .distinct()
                .collect(Collectors.toList());
        return authors;
    }
}
