package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (new StringValidator().isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void grading(Mark mark) { // érdemjegy rögzítése
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        } else {
            marks.add(mark);
        }
    }

    public double calculateAverage() { // teljes átlag számolása
        double average = (double) marksSum(marks) / marks.size();
        return Math.round(average * 100) / 100.0;
    }

    private int marksSum(List<Mark> marks) {
        int marksSum = 0;
        for (Mark actual : marks) {
            marksSum += actual.getMarkType().getGrade();
        }
        return marksSum;
    }

    public double calculateSubjectAverage(Subject subject) { // tantárgyhoz tartozó átlag számítása
        double average = (double) marksSumPerSubject(marks, subject) / countSubjectOccurrence(marks, subject);
        return Math.round(average * 100) / 100.0;
    }

    private int marksSumPerSubject(List<Mark> marks, Subject subject) {
        int marksSum = 0;
        for (Mark actual : marks) {
            if (actual.getSubject().getSubjectName().equals(subject.getSubjectName()))
                marksSum += actual.getMarkType().getGrade();
        }
        return marksSum;
    }

    private int countSubjectOccurrence(List<Mark> marks, Subject subject) {
        int count = 0;
        for (Mark actual : marks) {
            if (actual.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                count++;
            }
        }
        return count;
    }

    public String toString() {// diák szöveges reprezentációja
        StringBuilder sb = new StringBuilder(name + " marks: ");
        boolean first = true;
        for (Mark actual : marks) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(actual.getSubject().getSubjectName());
            sb.append(": ");
            sb.append(actual.toString());
        }
        return sb.toString();
    }
}
