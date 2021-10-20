package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot:");
        int b = scanner.nextInt();
        boolean result = b % 3 == 0 ? true : false;

        System.out.println("A szám osztható hárommal: " + result);


    }
}
