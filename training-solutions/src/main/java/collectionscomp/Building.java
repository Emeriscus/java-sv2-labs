package collectionscomp;

import interfacedefaultmethods.seats.Seat;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private String address;
    private int floorArea;
    private int levels;

    public Building(String address, int floorArea, int levels) {
        this.address = address;
        this.floorArea = floorArea;
        this.levels = levels;
    }

    public String getAddress() {
        return address;
    }

    public int getFloorArea() {
        return floorArea;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public int compareTo(Building other) {
        return levels - other.getLevels();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", floorArea=" + floorArea +
                ", levels=" + levels +
                '}';
    }

    public static void main(String[] args) {

        Set<Building> buildings = new TreeSet<>();

        buildings.add(new Building("ccc", 231, 3));
        buildings.add(new Building("aaa", 100, 2));
        buildings.add(new Building("kkk", 90, 1));
        buildings.add(new Building("eee", 80, 5));
        buildings.add(new Building("zzz", 70, 14));
        buildings.add(new Building("ddd", 60, 7));

        System.out.println(buildings);
    }
}
