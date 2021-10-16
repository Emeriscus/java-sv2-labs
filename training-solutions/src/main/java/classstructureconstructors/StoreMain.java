package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első cikk nevét: ");
        String product = scanner.nextLine();
        Store store1 = new Store(product);

        System.out.println("Kérem az második cikk nevét: ");
        product = scanner.nextLine();
        Store store2 = new Store(product);

        System.out.println("Az első cikk: " + store1.getProduct());
        System.out.println("Az második cikk: " + store2.getProduct());

        System.out.println("Mennyivel növeljük a " + store1.getProduct() + " készletét?");
        int stock = scanner.nextInt();
        store1.store(stock);
        System.out.println("A " + store1.getProduct() + " aktuális készlete: " + store1.getStock());

        System.out.println("Mennyivel növeljük a " + store2.getProduct() + " készletét?");
        stock = scanner.nextInt();
        store2.store(stock);
        System.out.println("A " + store2.getProduct() + " aktuális készlete: " + store2.getStock());

        System.out.println("Mennyivel csökkentsük a " + store1.getProduct() + " készletét?");
        stock = scanner.nextInt();
        store1.dispatch(stock);
        System.out.println("A " + store1.getProduct() + " aktuális készlete: " + store1.getStock());

        System.out.println("Mennyivel csökkentsük a " + store2.getProduct() + " készletét?");
        stock = scanner.nextInt();
        store2.dispatch(stock);
        System.out.println("A " + store2.getProduct() + " aktuális készlete: " + store2.getStock());

    }

}
