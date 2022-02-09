package lambdaintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {

    private List<Flat> flats = new ArrayList<>();

    public RealEstateAgency(List<Flat> flats) {
        this.flats = flats;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    private Flat findFirst(Predicate<Flat> condition) {
        for (Flat actual : flats) {
            if (condition.test(actual)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("No such flat.");
    }

    public Flat findFirstFlatInSameTown(String town) {
        return findFirst(flat -> flat.getAddress().contains(town));
//        return flats.stream()
//                .filter(flat -> flat.getAddress().contains(town))
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("No such flat."));
    }

    public Flat findFirstGreaterFlat(double minArea) {
        return findFirst(flat -> flat.getArea() > minArea);
//        return flats.stream()
//                .filter(flat -> flat.getArea() > minArea)
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("No such flat."));
    }

    public Flat findFirstCheaperFlat(int maxPrice) {
        return findFirst(flat -> flat.getPrice() < maxPrice);
//        return flats.stream()
//                .filter(flat -> flat.getPrice() < maxPrice)
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("No such flat."));
    }
}
