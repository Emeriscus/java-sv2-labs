package methodstructure.pendrives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendrives) {

        Pendrive result = pendrives.get(0);
        for (int i = 0; i < pendrives.size(); i++) {
            if (pendrives.get(i).comparePricePerCapacity(result) == -1) {
                result = pendrives.get(i);
            }
        }
        return result;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives) {
        Pendrive result = pendrives.get(0);

        for (Pendrive actual : pendrives) {
            if (actual.isCheaperThan(result)) {
                result = actual;
            }
        }
        return result;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {

        for (Pendrive actual : pendrives) {
            if (actual.getCapacity() == capacity) {
                actual.risePrice(percent);
            }
        }
    }
}
