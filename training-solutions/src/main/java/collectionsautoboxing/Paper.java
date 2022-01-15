package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    private Map<String, Integer> paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return paper;
    }

    public void putFurtherPaper(String className, int kilogramms) {
        if (!paper.containsKey(className)) {
            paper.put(className, kilogramms);
        } else {
            paper.put(className, paper.get(className) + kilogramms);
        }
    }

    public String getWinnerClass() {
        int result = 0;
        String resultName = null;
        for (Map.Entry actual : paper.entrySet()) {
            if ((int) actual.getValue() > result) {
                result = (int) actual.getValue();
                resultName = (String) actual.getKey();
            }
        }
        return resultName;
    }

    public int getTotalWeight() {
        int result = 0;
        for (Integer actual : paper.values()) {
            result += actual;
        }
        return result;
    }
}
