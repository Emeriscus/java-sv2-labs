package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public Random getRnd() {
        return rnd;
    }

    public boolean addStudent(Student student) { // felvesz egy diákot az osztályba
        if (!doesStudentAlreadyExist(students, student.getName())) {
            students.add(student);
            return true;
        } else {
            return false;
        }
    }

    private boolean doesStudentAlreadyExist(List<Student> students, String name) {
        for (Student actual : students) {
            if (actual.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(Student student) { //kivesz egy diákot az osztályból

        for (Student actual : students) {
            if (actual.getName().equals(student.getName())) {
                students.remove(actual);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage() { //osztályátlagot számol, minden diákot figyelembe véve

        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        if (!isAnyMarkInClassRecords(students)) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }

        int sumOfStudents = 0;
        double sumOfAverages = 0.0;
        for (Student actual : students) {
            sumOfStudents++;
            sumOfAverages += actual.calculateAverage();
        }
        double classAverage = sumOfAverages / sumOfStudents;
        return Math.round(classAverage * 100) / 100.0;
    }

    private boolean isAnyMarkInClassRecords(List<Student> students) {
        boolean isAnyMark = false;
        for (Student actual : students) {
            if (actual.getMarks().size() != 0) {
                isAnyMark = true;
            }
        }
        return isAnyMark;
    }

    public double calculateClassAverageBySubject(Subject subject) { //tantárgy szerinti osztályátlagot számol,
        // kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye

        int sumOfMarksBySubject = 0;
        double sumOfMarksGrade = 0.0;
        for (Student actual : students) {
            if (calculateAverageOfStudentBySubject(actual, subject) != 0) {
                sumOfMarksBySubject++;
                sumOfMarksGrade += calculateAverageOfStudentBySubject(actual, subject);
            }
        }
        double average = (double) sumOfMarksGrade / sumOfMarksBySubject;
        return Math.round(average * 100) / 100.0;
    }

    private double calculateAverageOfStudentBySubject(Student student, Subject subject) {

        int sumOfMarks = 0;
        int sumOfGrade = 0;
        for (Mark actual : student.getMarks()) {
            if (subject.getSubjectName().equals(actual.getSubject().getSubjectName())) {
                sumOfMarks++;
                sumOfGrade += actual.getMarkType().getGrade();
            }
        }
        double average = (double) sumOfGrade / sumOfMarks;
        return Math.round(average * 100) / 100.0;
    }

    public Student findStudentByName(String name) {// név szerint megkeres egy diákot az osztályban

        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }

        StringValidator strv = new StringValidator();
        if (strv.isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        for (Student actual : students) {
            if (name.equals(actual.getName())) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() { //felelethez a listából random módon kiválaszt egy diákot
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }

        return students.get(rnd.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() { //a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,
        // és azok listáját adja vissza
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student actual : students) {
            studyResultByNames.add(new StudyResultByName(actual.getName(), actual.calculateAverage()));
        }
        return studyResultByNames;
    }

    public String listStudentNames() { //kilistázza a diákok neveit, vesszővel elválasztva

        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Student actual : students) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(actual.getName());
        }
        return sb.toString();
    }
}
