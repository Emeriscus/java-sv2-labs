package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void createMovieTest() {
        Movie movie = new Movie("Mad Max", Category.ACTION, 3);

        assertEquals("Mad Max", movie.getTitle());
        assertEquals(Category.ACTION, movie.getCategory());
        assertEquals(3, movie.getRating());
    }
}