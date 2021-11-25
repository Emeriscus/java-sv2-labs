package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    List<Animal> animals = new ArrayList<>(Arrays.asList(
            new Animal("Gólya", 2),
            new Animal("Nyúl", 4),
            new Animal("Róka", 4),
            new Animal("Cinke", 2),
            new Animal("Elefánt", 4),
            new Animal("Pók", 8)
    ));

    Zoo zoo = new Zoo(animals);

    @Test
    void getAnimalsWithNumberOfLegsGivenTest() {

        assertEquals(3, zoo.getAnimalsWithNumberOfLegsGiven(4).size());
        assertEquals(1, zoo.getAnimalsWithNumberOfLegsGiven(8).size());
        assertEquals(0, zoo.getAnimalsWithNumberOfLegsGiven(12).size());
    }

    @Test
    void addAnimalTest() {

        assertEquals(6, zoo.getAnimals().size());

        zoo.addAnimal(new Animal("Gorilla", 4));
        assertEquals(7, zoo.getAnimals().size());
    }
}
