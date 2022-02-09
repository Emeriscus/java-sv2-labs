package lambdaoptional;

import optional.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class Costumer {

    private List<Costume> costumes = new ArrayList<>();

    public Costumer(List<Costume> costumes) {
        this.costumes = costumes;
    }

    public List<Costume> getCostumes() {
        return costumes;
    }

    public Optional<Costume> findFirstCostumeWithKeyWord(String keyWord) {
        return findFirst(c -> c.getDescription().contains(keyWord));
    }

    public Optional<Costume> findFirstCheaperCostume(int maxPrice) {
        return findFirst(c -> c.getPrice() < maxPrice);
    }

    public Optional<Costume> findFirstCostumeSameSize(Size size) {
        return findFirst(c -> size.equals(c.getSize()));
    }

    private Optional<Costume> findFirst(Predicate<Costume> condition) {
        for (Costume actual : costumes) {
            if (condition.test(actual)) {
                return Optional.of(actual);
            }
        }
        return Optional.empty();
    }
}
