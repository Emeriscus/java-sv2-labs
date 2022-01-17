package sorting.webshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WebShop {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void addProducts(Product product) {
        products.add(product);
    }

    public List<Product> getProductsOrderByName() {

        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return sorted;
        //return namesFromOrderedList(sorted);
    }

    public List<Product> getProductsOrderByPrice() {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.valueOf(o1.getPrice()).compareTo(Integer.valueOf(o2.getPrice()));
            }
        });
        return sorted;
        //       return namesFromOrderedList(sorted);
    }

    public List<Product> getProductsOrderByDate() {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return sorted;
        //       return namesFromOrderedList(sorted);
    }

//    private List<String> namesFromOrderedList(List<Product> sorted) {
//        List<String> names = new ArrayList<>();
//        for (Product actual : sorted) {
//            names.add(actual.getName());
//        }
//        return names;
//    }
}
