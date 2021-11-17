package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy pozitív számot: ");
        String positiveNumber = scanner.nextLine();

        for (char actual : positiveNumber.toCharArray()) {
            if (!Character.isDigit(actual)) {
                throw new IllegalArgumentException("Ez nem pozitív szám: " + positiveNumber);
            }
        }
    }
}
