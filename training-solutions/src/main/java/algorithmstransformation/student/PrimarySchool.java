package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    private List<Person> persons = new ArrayList<>();

    public PrimarySchool(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        for (Person actual : persons) {
            if (6 <= actual.getAge() && actual.getAge() <= 14) {
                students.add(new Student(actual.getName(), actual.getAddress()));
            }
        }
        return students;
    }

    public List<Person> getPersons() {
        return persons;
    }
}
