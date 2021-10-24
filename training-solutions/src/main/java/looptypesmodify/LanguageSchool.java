package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {

        Student student01 = new Student("Peti", true);
        Student student02 = new Student("Pisti", true);
        Student student03 = new Student("Enci", true);
        Student student04 = new Student("Juci", true);
        Student student05 = new Student("Józsi", true);
        Student student06 = new Student("Virág", true);
        Student student07 = new Student("Feri", true);

        List<Student> studentsList = new ArrayList<>();

        studentsList.add(student01);
        studentsList.add(student02);
        studentsList.add(student03);
        studentsList.add(student04);
        studentsList.add(student05);
        studentsList.add(student06);
        studentsList.add(student07);

        System.out.println(studentsList.size());

        student01.setActive(false);
        student05.setActive(false);

        List<Student> elementToRemove= new ArrayList<>();
        for (Student student: studentsList) {
            if (student.isActive() == false) {
                elementToRemove.add(student);
            }
        }
        studentsList.removeAll(elementToRemove);

        System.out.println(studentsList.size());

    }
}
