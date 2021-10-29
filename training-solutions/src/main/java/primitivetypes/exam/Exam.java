package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> examList = new ArrayList<>();

    public List<Person> getExamList() {
        return examList;
    }

    public void addPerson(Person person) {
        examList.add(person);
    }
}
