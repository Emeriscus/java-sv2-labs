package searching;

import java.util.Arrays;
import java.util.Collections;

public class Mountain {

    private int[] heights;

    public Mountain(int[] heights) {
        this.heights = heights;
    }

    public boolean searchPike(Pike pike) {
        return Arrays.binarySearch(heights, pike.getHeight()) >= 0;
    }
}
