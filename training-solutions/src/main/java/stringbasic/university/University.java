package stringbasic.university;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void areEqual(Student student, Student anotherStudent) {

        if (student.getNeptunCode().equals(anotherStudent.getNeptunCode())
                && student.getStudentIdentifier().equals(anotherStudent.getStudentIdentifier())) {
            System.out.println("A két hallgató ugyanaz");
        } else {
            System.out.println("A két hallgató különbözik");
        }
    }
}
