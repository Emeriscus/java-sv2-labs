package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String getFullName(String surName, String firstName) {
        return surName + " " + firstName;
    }

    public LocalDate getBirthDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a vezetéknevet: ");
        String surName = scanner.nextLine();

        System.out.print("Kérem a keresztnevet: ");
        String firstName = scanner.nextLine();

        System.out.print("Kérem a születési évet: ");
        int year = scanner.nextInt();

        System.out.print("Kérem a születési hónapot: ");
        int month = scanner.nextInt();

        System.out.print("Kérem a születési napot: ");
        int day = scanner.nextInt();

        System.out.print("Kérem az e-mail címet: ");
        scanner.nextLine();
        String email = scanner.nextLine();


        Person person = new Person(registration.getFullName(surName, firstName), registration.getBirthDate(year, month, day), email);

        System.out.println();
        System.out.println(person.toString());

        }
}
