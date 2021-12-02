package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        coffee.setName("Eduscho");
        coffee.setPrice(450);

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();

        cappuccino.setName("Karaván");
        cappuccino.setPrice(350);

        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }
}
