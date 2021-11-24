package algorithmssum.school;

import java.util.List;

public class School {

    public int getNumberOfStudents(List<Integer> headcounts) {
        int sum = 0;

        for (int actual : headcounts) {
            sum += actual;
        }

        return sum;
    }
}
