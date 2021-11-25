package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<String> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<String> result = new ArrayList<>();

        for (Animal actual : animals) {
            if (actual.getNumberOfLegs() == numberOfLegs) {
                result.add(actual.getName());
            }
        }
        return result;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
