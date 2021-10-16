package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a termék nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem a termék árát:");
        int price = scanner.nextInt();

        Product product = new Product(name, price);

        System.out.println("A termék neve: " + product.getName());
        System.out.println("A termék ára: " + product.getPrice());

        System.out.println();
        System.out.print("A(z) " + product.getName() + " árának növekedése: ");
        product.increasePrice(scanner.nextInt());
        System.out.println("A(z) " + product.getName() + " új ára: " + product.getPrice());

        System.out.println();
        System.out.print("A(z) " + product.getName() + " árának csökkenése: ");
        product.decreasePrice(scanner.nextInt());
        System.out.println("A(z) " + product.getName() + " új ára: " + product.getPrice());

    }
}
