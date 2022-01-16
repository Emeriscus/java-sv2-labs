package collectionscomp;

import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student("cc", 175));
        students.add(new Student("bb", 190));
        students.add(new Student("áá", 181));
        students.add(new Student("aa", 149));
        students.add(new Student("zz", 163));
        students.add(new Student("éé", 150));
        students.add(new Student("ee", 185));
        students.add(new Student("dd", 172));

        System.out.println(students);

        Map<String, Integer> studentsMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));

        studentsMap.put("cc", 175);
        studentsMap.put("bb", 190);
        studentsMap.put("áá", 181);
        studentsMap.put("aa", 149);
        studentsMap.put("zz", 163);
        studentsMap.put("éé", 150);
        studentsMap.put("ee", 185);
        studentsMap.put("dd", 172);

        System.out.println(studentsMap);
    }
}
