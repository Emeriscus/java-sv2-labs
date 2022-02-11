package lambdastreams.bookstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class BookStore {

    private List<Book> books = new ArrayList<>();

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Integer getNumberOfBooks() {

//        BinaryOperator<Integer> op= (a,b)->a+b;
//        return books.stream()
//                .map(Book::getStock)
//                .reduce(0, op);

//        return books.stream()
//                .map(Book::getStock)
//                .reduce(0, (a, b) -> a + b);

//        return books.stream()
//                .mapToInt(Book::getStock)
//                .sum();

        return books.stream().reduce(0, (a, b) -> a + b.getStock(), (x, y) -> x + y);
    }

    public Optional<Book> findNewestBook() {
        return books.stream()
                .max(Comparator.comparing(Book::getYearOfPublish));
    }

    public Integer getTotalValue() {
//        return books.stream()
//                .mapToInt(b -> b.getStock() * b.getPrice())
//                .sum();

        return books.stream().reduce(0, (a, b) -> a + b.getPrice() * b.getStock(), (x, y) -> x + y);
    }

}
