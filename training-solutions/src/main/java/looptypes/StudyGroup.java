package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students) {
        List<String> split1 = new ArrayList<>();
        List<String> split2 = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).length() <= 10) {
                split1.add(students.get(i));
            } else {
                split2.add(students.get(i));
            }
        }
        System.out.println("Az 1-es csoport tagjai:");
        System.out.println(split1.toString());

        System.out.println();
        System.out.println("Az 2-es csoport tagjai:");
        System.out.println(split2.toString());
        }

    public static void main(String[] args) {

        StudyGroup studyGroup = new StudyGroup();
        List<String> students = Arrays.asList("Kiss Béla", "Nagy Erika", "Kenyeres Richárd", "Kicsi Emőke");
        studyGroup.printStudyGroups(students);

    }
}
