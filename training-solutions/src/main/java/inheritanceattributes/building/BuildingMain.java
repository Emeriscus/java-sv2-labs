package inheritanceattributes.building;

public class BuildingMain {
    public static void main(String[] args) {

        Building building = new Building("Könyvtár", 680, 4);

        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());


        SchoolBuilding schoolBuilding = new SchoolBuilding("Közgáz", 350, 3, 15);
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
