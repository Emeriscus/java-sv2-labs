package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void createAnimalTest() {

        Animal animal = new Animal("Gólya", 2);

        assertEquals(2, animal.getNumberOfLegs());
        assertEquals("Gólya", animal.getName());
    }
}