package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {

    private List<ExamResult> results = new ArrayList<>();

    public Exam(List<ExamResult> results) {
        this.results = results;
    }

    public List<ExamResult> getResults() {
        return results;
    }

    public List<String> getNamesOfSucceededPeople(int places) {

        if (places > results.size()) {
            throw new IllegalArgumentException("There aren't enough students");
        }

        List<ExamResult> sorted = new ArrayList<>(results);
        Collections.sort(sorted);
        Collections.reverse(sorted);

        List<String> result = new ArrayList<>();
        for (int i = 0; i < places; i++) {
            result.add(sorted.get(i).getName());
        }
        return result;
    }

}
