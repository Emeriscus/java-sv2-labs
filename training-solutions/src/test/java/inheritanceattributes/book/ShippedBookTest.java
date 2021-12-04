package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    @Test
    void orderTest() {
        ShippedBook shippedBook = new ShippedBook("Misery", 4500, 990);

        assertEquals(9990, shippedBook.order(2));

    }

    @Test
    void toStringTest() {
        ShippedBook shippedBook = new ShippedBook("Misery", 4500, 990);

        assertEquals("Misery: 4500 Ft, postaköltség: 990 Ft", shippedBook.toString());
    }


}