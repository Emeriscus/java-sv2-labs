package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public int findHowMany(Product product) {
        int result = 0;
        for (Product actual : products) {
            if (actual.equals(product)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        WebShop webShop = new WebShop();

        webShop.addProduct(new Product("beer", "2222"));
        webShop.addProduct(new Product("bread", "1111"));
        webShop.addProduct(new Product("wine", "1111"));
        webShop.addProduct(new Product("butter", "3333"));
        webShop.addProduct(new Product("meat", "1111"));

        System.out.println(webShop.findHowMany(new Product("tv", "1111")));

    }
}
