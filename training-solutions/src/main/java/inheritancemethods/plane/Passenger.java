package inheritancemethods.plane;

public class Passenger {

    private String name;
    private int priceOfPlane;

    public Passenger(String name, int priceOfPlane) {
        this.name = name;
        this.priceOfPlane = priceOfPlane;
    }

    public String getName() {
        return name;
    }

    public int getPriceOfPlane() {
        return priceOfPlane;
    }


}
