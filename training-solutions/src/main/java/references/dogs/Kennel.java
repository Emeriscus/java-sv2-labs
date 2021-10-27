package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        Dog dog1 = new Dog("Morzsi", 5, "barna");
        Dog dog2 = new Dog("Rex", 2, "fekete");
        Dog dog3 = new Dog("Cézár", 8, "fehér");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        System.out.println(dogs.toString());

        Dog dog4 = dogs.get(1);

        dog4.setColour("foltos");

        System.out.println(dogs.toString());

        Dog dog5 =new Dog("Buksi", 12, "világosbarna");
        System.out.println(dog5.toString());

        dog5 = dogs.get(1);
        System.out.println(dog5.toString());

        dogs.add(dog5);
        System.out.println(dogs.toString());

        Dog dog6 = dog4;
        dog6.setColour("fekete-fehér foltos");
        System.out.println(dogs.toString());

        List<Dog> newDogs = dogs;

        Dog dog7 = dog4;
        dog7.setColour("csíkos");
        System.out.println(newDogs.toString());

        dog2.setColour("tigriscsíkos");

        dog2 = null;
        System.out.println(newDogs.toString());

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(newDogs.toString());

        Dog dog9 = dogs.get(1);
        dog9.setColour("sárga-fekete tigriscsíkos");
        System.out.println(newDogs.toString());






    }
}
