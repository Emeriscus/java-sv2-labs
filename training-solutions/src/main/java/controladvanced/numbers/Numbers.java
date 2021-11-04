package controladvanced.numbers;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Kérek egy pozitív, egész számot:");
        int number = scanner.nextInt();

        OUTER: while (true) {
            if (number % 7 == 0) {
                System.out.println("x");
                number++;
            }
            System.out.println(number);
            number++;
            if (number % 7 != 0 && String.valueOf(number).contains("7")) { // vagy Integer.toString(number).contains("7")
                break OUTER;
            }
        }
    }
}
