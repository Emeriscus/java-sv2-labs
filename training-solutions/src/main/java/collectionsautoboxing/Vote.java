package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> results) {

        Map<VoteResult, Integer> sumOfResult = new HashMap<>();
        for (Map.Entry actual : results.entrySet()) {
            if (!sumOfResult.containsKey(actual.getValue())) {
                sumOfResult.put((VoteResult) actual.getValue(), 1);
            } else {
                sumOfResult.put((VoteResult) actual.getValue(), sumOfResult.get((VoteResult) actual.getValue()) + 1);
            }
        }
        return sumOfResult;
    }
}
