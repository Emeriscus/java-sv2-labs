package collectionsmap;

import java.util.Map;
import java.util.TreeMap;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {

        int result = Integer.MAX_VALUE;
        for (Integer i : applicants.keySet()) {
            if (i > lastNumber && i < result) {
                result = i;
            }
        }
        return applicants.get(result);
    }
}
