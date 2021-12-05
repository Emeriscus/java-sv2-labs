package inheritancemethods.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Az extra üzemanyag nem lehet több, mint extra üzemanyag tároló kapacitása!");
        }

        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    public void drive(int km) { // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
        if (isEnoughFuelJeepToDrive(km)) {
            double fuelNeeded = km * getFuelRate() / 100;
            if (extraFuel >= fuelNeeded) {
                extraFuel -= fuelNeeded;
            } else {
                modifyFuelAmount(extraFuel - fuelNeeded);
                extraFuel = 0;
            }
        } else {
            throw new IllegalArgumentException("Nincs elég üzemanyag az út megtételéhez");
        }
    }

    public double calculateRefillAmount() {//kiszámolja, mennyit lehet tankolni
        return (getTankCapacity() + getExtraCapacity()) - (getFuel() + getExtraFuel());
    }


    private boolean isEnoughFuelJeepToDrive(int km) {
        return (super.getFuel() + extraFuel) - km * getFuelRate() / 100 >= 0.0;
    }
}
