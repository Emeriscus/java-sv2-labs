package collectionsset;

import java.util.*;

public class PhysicalEducation {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> result = new TreeSet<>();

        for (Student actual : students) {
            result.add(actual.getHeight());
        }
        return result;
    }

    public static void main(String[] args) {

        PhysicalEducation physicalEducation = new PhysicalEducation();

        physicalEducation.students.add(new Student("Joe", 158));
        physicalEducation.students.add(new Student("Jill", 172));
        physicalEducation.students.add(new Student("Joe", 182));
        physicalEducation.students.add(new Student("Joe", 149));
        physicalEducation.students.add(new Student("Joe", 152));
        physicalEducation.students.add(new Student("Joe", 176));

        System.out.println(physicalEducation.getOrderInLessons(physicalEducation.getStudents()));
    }
}
