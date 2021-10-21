package stringtype.registration;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserValidator userValidator = new UserValidator();

        System.out.println("Kérem a felhasználónevet:");
        String username = scanner.nextLine();

        System.out.println(userValidator.isValidUsername(username) ? "A felhasználó név megfelelő" : "A felhasználó név nem megfelelő");

        System.out.println("Kérem a jelszót:");
        String password1 = scanner.nextLine();

        System.out.println("Kérem újra a jelszót:");
        String password2 = scanner.nextLine();

        System.out.println(userValidator.isValidPassword(password1, password2) ? "A két jelszó megfelelő hosszú, és megegyezik" : "A két jelszó nem egyezik, vagy kevesebb mint 8 karakter hosszú!");

        System.out.println("Kérem az e-mail címet:");
        String email = scanner.nextLine();

        System.out.println(userValidator.isValidEmail(email) ? "Az e-mail cím megfelelő" : "Az e-mail cím nem megfelelő");
    }
}
