package linebreak;

public class Car {
        String brand;
        String type;

        public String getBrandAndTypeInSeparateLines(String brand, String type) {
            this.brand = brand;
            this.type = type;
            return brand + "\n" + type;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getBrandAndTypeInSeparateLines("Lada", "Niva"));
    }
}
