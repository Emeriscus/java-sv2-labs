package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.setName("Banán");
        fruit.setWeight(250);

        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        Apple apple = new Apple();
        apple.setName("Jonatán");
        apple.setWeight(200);
        apple.setPieces(15);

        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());

        Grape grape = new Grape();
        grape.setName("Merlot");
        grape.setWeight(150);
        grape.setType("vörös");

        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("Golden");
        goldenDelicious.setWeight(100);
        goldenDelicious.setPieces(10);

        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getWeight());
        System.out.println(goldenDelicious.getPieces());
        System.out.println(goldenDelicious.getColour());

        Starking starking = new Starking();
        starking.setName("Golden");
        starking.setWeight(50);
        starking.setPieces(5);

        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
    }
}
