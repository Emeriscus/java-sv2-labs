package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void loadShip(int passengers, int cargoWeight) {
        int actualPassengers = passengers;
        int actualCargoWeight = cargoWeight;

        for (Ship actual : ships) {

            if (actual instanceof Liner && actualPassengers > 0) {
                int overload = ((Liner) actual).loadPassenger(actualPassengers);

                if (overload > 0) {
                    actualPassengers -= ((Liner) actual).getPassengers();
                } else {
                    actualPassengers = 0;
                }
            }

            if (actual instanceof CargoShip && actualCargoWeight > 0) {
                int overload = ((CargoShip) actual).loadCargo(actualCargoWeight);

                if (overload > 0) {
                    actualCargoWeight -= ((CargoShip) actual).getCargoWeight();
                } else {
                    actualCargoWeight = 0;
                }
            }

            if (actual instanceof FerryBoat && (actualCargoWeight > 0 || actualPassengers > 0)) {
                int overloadCargo = ((FerryBoat) actual).loadCargo(actualCargoWeight);
                int overloadPassenger = ((FerryBoat) actual).loadPassenger(actualPassengers);

                if (overloadCargo > 0) {
                    actualCargoWeight -= ((FerryBoat) actual).getCargoWeight();
                } else {
                    actualCargoWeight = 0;
                }

                if (overloadPassenger > 0) {
                    actualPassengers -= ((FerryBoat) actual).getPassengers();
                } else {
                    actualPassengers = 0;
                }
            }
        }
        this.waitingPeople = actualPassengers;
        this.waitingCargo = actualCargoWeight;
    }

//  "hivatalos" megoldás
/*    public void loadShip(int passengers, int cargoWeight) {
        int remainingPersons = passengers;
        int remainingCargo = cargoWeight;
        for (Ship ship : ships) {
            if (ship instanceof CanCarryPassengers) {
                if (remainingPersons != 0) {
                    remainingPersons = ((CanCarryPassengers) ship).loadPassenger(remainingPersons);
                }
            }
            if (ship instanceof CanCarryGoods) {
                if (remainingCargo != 0) {
                    remainingCargo = ((CanCarryGoods) ship).loadCargo(remainingCargo);
                }
            }
        }
        waitingPeople = remainingPersons;
        waitingCargo = remainingCargo;
    }*/

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
