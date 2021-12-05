package inheritancemethods.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Az üzemanyag nem lehet több, mint a tank kapacitása!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        if (isEnoughFuelToDrive(km)) {
            fuel -= fuelRate * km / 100;
        } else {
            throw new IllegalArgumentException("Nincs elég üzemanyag az út megtételéhez");
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    private boolean isEnoughFuelToDrive(int km) {
        return (fuel - fuelRate * km / 100) >= 0.0;
    }
}