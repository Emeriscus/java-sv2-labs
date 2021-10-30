package enumtype.solarsystem;

import java.util.Arrays;

public class SolarSystemMain {
    public static void main(String[] args) {

        System.out.println(SolarSystem.values());

        System.out.println();
        System.out.println(SolarSystem.valueOf("FÖLD"));
        System.out.println(SolarSystem.FÖLD.getMoons());

        System.out.println(Arrays.toString(SolarSystem.values()));
        System.out.println(SolarSystem.JUPITER.ordinal());

        System.out.println();
        for (SolarSystem i: SolarSystem.values()) {
            System.out.print(i.getMoons() + ", ");
        }
        System.out.println();
        for (SolarSystem i: SolarSystem.values()) {
            System.out.print(i + ", ");
        }
    }
}
