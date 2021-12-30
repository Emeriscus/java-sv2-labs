package polymorphism.river;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Danube extends River {

    private List<String> capitals = new ArrayList<>();

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {

        Water danubeWater = new Danube("Duna", 1100, List.of("Budapest", "Bécs"));
        River danubeRiver = new Danube("Nílus", 5100, List.of("Kairó", "Nairobi"));
        Danube danube = new Danube("Don", 3100, List.of("Moszkva", "Riga"));

        System.out.println(danubeRiver.getLength());
        System.out.println(danubeRiver.getName());

        System.out.println(danube.getLength());
        System.out.println(danube.getName());
        System.out.println(danube.getCapitals());
    }
}
