package inheritancemethods.plane;

public class PriorityPassenger extends Passenger {

    private final int percent;

    public PriorityPassenger(String name, int priceOfPlane, int percent) {
        super(name, priceOfPlane);
        this.percent = percent;
    }

    @Override
    public int getPriceOfPlane() {
        return (int) (super.getPriceOfPlane() * (1 + getPercent() / 100.0));
    }

    public int getPercent() {
        return percent;
    }
}
