package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double goodResult = 0.125;

        System.out.println("Mennyi az eredmény: ((3*2)-5)/8");
        double result = scanner.nextDouble();

        if (Math.abs(goodResult - result) < 1.0e-4) {
            System.out.println("A megoldás helyes");
        } else {
            System.out.println("A megoldás helytelen");
        }
    }
}
