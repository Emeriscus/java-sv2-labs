package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void countChildrenWithHeightGreaterThanTest() {
        Height height = new Height();

        List<Integer> heights = Arrays.asList(150, 151, 155, 160, 118, 173, 151);
        int heightLimit = 150;

        assertEquals(5, height.countChildrenWithHeightGreaterThan(heights, heightLimit));
    }
}