package virtualmethod.vehicle;

import java.util.ArrayList;
import java.util.List;

public class FerryBoat extends Vehicle {

    private Car car;
    private static final int MAX_CARRY_WEIGHT = 2_000;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + car.getGrossLoad();
    }

    public boolean canCarry(Car car) {
        if (car.getGrossLoad() < MAX_CARRY_WEIGHT) {
            return true;
        }
        return false;
    }

    public boolean load(Car car) {
        if (canCarry(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{car=" + car.toString() + "}";
    }
}
