package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    private List<ChristmasPresent> presents = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public List<ChristmasPresent> getPresents() {
        return presents;
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {

        for (Iterator<ChristmasPresent> i = presents.iterator(); i.hasNext(); ) {
            int result = i.next().getPrice();
            if (result > maxPrice) {
                i.remove();
            }
        }
    }
}
