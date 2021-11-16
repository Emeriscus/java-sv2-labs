package introexceptiontrycatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculatorMain calculator = new CalculatorMain();
        try {
            System.out.println("A művelet eredménye: " + calculator.doOperation(calculator.getNumber(),
                    calculator.getAnotherNumber(), calculator.getOperation()));
        } catch (ArithmeticException ae){
            System.out.println("Nullával nem lehet osztani!");
        }
    }

    public int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        try {
            System.out.println("Kérek egy egész számot:");
            number = scanner.nextInt();

        } catch (InputMismatchException ime) {
            System.out.println("Ez nem egy egész szám!");
        }
        return number;
    }

    public int getAnotherNumber() {
        Scanner scanner = new Scanner(System.in);
        int anotherNumber = 0;

        try {
            System.out.println("Kérek egy másik egész számot:");
            anotherNumber = scanner.nextInt();

        } catch (InputMismatchException ime) {
            System.out.println("Ez nem egy egész szám!");
        }
        return anotherNumber;
    }

    public String getOperation() {
        Scanner scanner = new Scanner(System.in);
        String operation;

        do {
            System.out.println("Milyen műveletet szeretne elvégezni (+,-,/,*):");
            operation = scanner.nextLine();

        } while (!(("+").equals(operation) || ("-").equals(operation) || ("/").equals(operation) || ("*").equals(operation)));
        return operation;
    }

    public int doOperation(int number, int anothernumber, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                new Calculator().addNumbers(number, anothernumber);
                break;
            case "-":
                new Calculator().extractionNumbers(number, anothernumber);
                break;
            case "/":
                new Calculator().divideNumbers(number, anothernumber);
                break;
            case "*":
                new Calculator().multipleNumbers(number, anothernumber);
                break;
        }
        return result;
    }
}
