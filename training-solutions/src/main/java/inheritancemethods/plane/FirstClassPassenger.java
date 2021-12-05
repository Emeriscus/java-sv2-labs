package inheritancemethods.plane;

public class FirstClassPassenger extends PriorityPassenger {

    private final int extraCharge = 20_000;

    public FirstClassPassenger(String name, int priceOfPlane, int percent) {
        super(name, priceOfPlane, percent);
    }

    public int getExtraCharge() {
        return extraCharge;
    }

    @Override
    public int getPriceOfPlane() {
        return super.getPriceOfPlane() + getExtraCharge();
    }
}
