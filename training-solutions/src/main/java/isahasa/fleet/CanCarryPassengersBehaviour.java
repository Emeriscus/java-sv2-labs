package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {

    private int passengers;
    private int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        if (passengers + this.passengers <= maxPassengers) {
            this.passengers += passengers;
            return 0;
        } else {
            int overload = (passengers + this.passengers) - maxPassengers;
            this.passengers = maxPassengers;
            return overload;
        }
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
