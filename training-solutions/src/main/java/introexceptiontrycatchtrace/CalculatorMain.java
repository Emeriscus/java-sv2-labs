package introexceptiontrycatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculatorMain calculator = new CalculatorMain();
        try {
            System.out.print("A művelet eredménye: ");
            calculator.doOperation(calculator.getNumber(), calculator.getAnotherNumber(), calculator.getOperation());
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
            System.out.println("A szám nulla lesz!");
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
            System.out.println("A szám nulla lesz!");
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

    public void doOperation(int number, int anothernumber, String operation) {
        switch (operation) {
            case "+":
                System.out.println(new Calculator().addNumbers(number, anothernumber));
                break;
            case "-":
                System.out.println(new Calculator().extractionNumbers(number, anothernumber));
                break;
            case "/":
                System.out.println(new Calculator().divideNumbers(number, anothernumber));
                break;
            case "*":
                System.out.println(new Calculator().multipleNumbers(number, anothernumber));
                break;
        }
    }
}
