package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Validation validation=new Validation();
        String name;
        String ageString;
        boolean validDatas=true;

        System.out.println("Üdvözlöm a regisztráláson! Szükségem lesz néhány adatra.");

        System.out.println("Kérem a nevét:");
        name = scanner.nextLine();

        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            validDatas=false;
        }

        System.out.println("Kérem az életkorát:");
        ageString = scanner.nextLine();

        try {
            validation.validateAge(ageString);
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            validDatas=false;
        }

        System.out.println();
        System.out.println("A megadott adatok:");
        System.out.println("Név: " + name);
        System.out.println("Életkor: " + ageString);

        if (validDatas){
            System.out.println("A regisztáció sikeres");
        } else {
            System.out.println("A regisztáció sikertelen");
        }
    }
}
