package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a dolgozó nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem a dolgozó születési évét:");
        int year = scanner.nextInt();

        System.out.println("Kérem a dolgozó születési hónapját:");
       int month = scanner.nextInt();

        System.out.println("Kérem a dolgozó születési napját:");
        int day = scanner.nextInt();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("A dolgozó neve: " + employee.getName());
        System.out.println("A dolgozó születési ideje: " + employee.getDateOfBirth());
        System.out.println("A dolgozó belépési ideje: " + employee.getBeginEmployment());

    }


}
