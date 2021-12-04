package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void createBookTest() {
        Book book = new Book("Cujo", 2500);

        assertEquals("Cujo", book.getTitle());
        assertEquals(2500, book.price);
    }

    @Test
    void purchaseTest() {
        Book book = new Book("It", 3500);
        int expected = book.purchase(5);

        assertEquals(17500, expected);
    }
}