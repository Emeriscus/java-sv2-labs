package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    VideoTheque videoTheque;

    @BeforeEach
    void init() {

        videoTheque = new VideoTheque();
        videoTheque.addMovie(new Movie("True lies", Category.ACTION, 4));
        videoTheque.addMovie(new Movie("King Richard", Category.DRAMA, 2));
        videoTheque.addMovie(new Movie("It", Category.HORROR, 4));
        videoTheque.addMovie(new Movie("Mad Max", Category.ACTION, 3));
        videoTheque.addMovie(new Movie("Die hard 3", Category.ACTION, 5));
    }


    @Test
    void getGoodMoviesWithCategoryGiven() {

        assertEquals(2, videoTheque.getGoodMoviesWithCategoryGiven(Category.ACTION).size());
    }
}