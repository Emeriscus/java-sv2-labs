package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name and press ENTER: ");
        String name = scanner.nextLine();
        System.out.println("Please type your e-mail address and press ENTER: ");
        String email = scanner.nextLine();
        System.out.println("Your name: " + name);
        System.out.println("your e-mail: " + email);
    }
}
