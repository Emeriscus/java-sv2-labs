package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> temperatures) {

        int min = Integer.MAX_VALUE;
        for (Integer actual : temperatures) {
            if (actual < min) {
                min = actual;
            }
        }
        return min;
    }
}
