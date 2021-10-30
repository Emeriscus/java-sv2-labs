package enumtype.university;

import java.util.Arrays;

public class UniversityMain {
    public static void main(String[] args) {

        System.out.println(University.values());
        System.out.println(University.valueOf("SOTE"));
        System.out.println(University.BME.getName());
        System.out.println(University.SOTE.toString());

        System.out.println();
        System.out.println(Arrays.toString(University.values()));

        for (University i : University.values()) {
            System.out.print(i + ", ");
        }

        System.out.println();
        for (University i : University.values()) {
            System.out.print(i.getName() + ", ");
        }
    }
}
