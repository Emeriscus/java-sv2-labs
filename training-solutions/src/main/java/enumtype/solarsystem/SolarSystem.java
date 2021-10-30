package enumtype.solarsystem;

public enum SolarSystem {

    MERKUR(0), VÉNUSZ(0), FÖLD(1), MARS(2), JUPITER(79), SZATURNUSZ(83), URÁNUSZ(27), NEPTUNUSZ(14);

    private final int moons;

    SolarSystem(int moons) {
        this.moons = moons;
    }

    public int getMoons() {
        return moons;
    }
}
