package algorithmsdecision.town;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> habitants, int min) {

        for (Integer actual : habitants) {
            if (actual < min) {
                return true;
            }
        }
        return false;
    }
}
