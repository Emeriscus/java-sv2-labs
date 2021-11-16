package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();

        Fish fish01 = new Fish("Guppi", "Green");
        aquarium.addFish(fish01);

        aquarium.addFish(new Fish("Piranja", "Blue"));

        Fish fish03 = new Fish("Shark", "Grey");
        aquarium.addFish(fish01);

        System.out.println(aquarium.getNumberOfFish());
        //a List<Fish> ornamentalFish miatt null lett az ornamentelFish értéke, ezért nem lehet add-dal hozzáadni.
    }
}

