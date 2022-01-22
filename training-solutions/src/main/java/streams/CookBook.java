package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CookBook {

    private List<Cake> cookBook = new ArrayList<>();

    public CookBook(List<Cake> cookBook) {
        this.cookBook = cookBook;
    }

    public List<Cake> getCookBook() {
        return cookBook;
    }

    public List<String> listCakeNamesWithGivenIngredient(String ingredient) {
        return cookBook.stream()
                .filter(cake -> cake.getIngredients().contains(ingredient))
                .map(Cake::getName)
                .collect(Collectors.toList());
    }

    public List<String> listCakeNamesWithMaxIngredients(int max) {
        return cookBook.stream()
                .filter(cake -> cake.getIngredients().size() <= max)
                .map(Cake::getName)
                .collect(Collectors.toList());
    }
}
