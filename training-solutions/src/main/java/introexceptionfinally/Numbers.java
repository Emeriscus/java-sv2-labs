package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String assist;
        int number;

        do {
            try {
                System.out.println("Kérek egy számot");
                assist = scanner.nextLine();
                number = Integer.parseInt(assist);

            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Ez nem szám volt", nfe);

            } finally {
                System.out.println("End of round.");
            }
        } while (Integer.parseInt(assist) % 2 != 0);
    }
}
