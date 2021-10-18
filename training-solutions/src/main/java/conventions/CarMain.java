package conventions;

/* import java.util.Scanner; */


public class CarMain {
    public static void main(String[] args) {
        /* Scanner scanner = new Scanner(System.in); */

        Car car = new Car("Suzuki", "benzin", 4, 5);

        System.out.println("Az autó adatai: " + car.getCarType() + car.getEngineType() + car.getDoors() + car.getPersons());
        String carType = "Lada";
        car.setCarType(carType);
        String engineType = "Diesel";
        car.setEngineType(engineType);
        int doors = 2;
        car.setDoors(doors);
        int persons = 4;
        car.setPersons(persons);

        System.out.println("Az autó adatai: " + car.getCarType() + car.getEngineType() + car.getDoors() + car.getPersons());

        car.addModelName("Niva");

        System.out.println("Az autó adatai: " + car.getCarType() + car.getEngineType() + car.getDoors() + car.getPersons());
    }
}
