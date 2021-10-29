package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a vizsgára jelentkező nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem a vizsgára jelentkező születési évét:");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Kérem a vizsgára jelentkező születési hónapját:");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.println("Kérem a vizsgára jelentkező születési napját:");
        int day = Integer.parseInt(scanner.nextLine());

        LocalDate birth = LocalDate.of(year, month, day);

        System.out.println("Kérem a vizsgára jelentkező lakhelyének irányítószámát:");
        int zipCode = Integer.parseInt(scanner.nextLine());

        System.out.println("Kérem a vizsgára jelentkező ostályzatainak átlagát:");
        double average = Double.parseDouble(scanner.nextLine());

        Person person = new Person(name, birth, zipCode, average);
//        Person person1 = new Person("Pisti", LocalDate.of(1988, 8, 10), 1150, 3.2);
//        Person person2 = new Person("Tündi", LocalDate.of(2000, 2, 20), 8000, 4.0);

        Exam examList = new Exam();
        examList.addPerson(person);
//        examList.addPerson(person1);
//        examList.addPerson(person2);

        System.out.println(examList.getExamList());
//        System.out.println(examList.toString());
//        System.out.println(examList.getExamList().get(0).getName());
//        System.out.println(examList.getExamList().get(0));
//        System.out.println(person1.getName());
    }
}
