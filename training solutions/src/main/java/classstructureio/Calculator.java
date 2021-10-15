package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Type an integer and press ENTER: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Type an another integer and press ENTER: ");
        int secondNumber = scanner.nextInt();
        System.out.print(firstNumber);
        System.out.print(" + ");
        System.out.println(secondNumber);
        System.out.println(firstNumber + secondNumber);
    }
}
