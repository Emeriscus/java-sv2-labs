package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent) {
        this.price += this.price * (percent / 100.0);
    }

    public int comparePricePerCapacity(Pendrive other) {

        double pricePerCapacity = price / capacity / 1.0;
        double otherPricePerCapacity = other.getPrice() / other.getCapacity() / 1.0;

        if (otherPricePerCapacity < pricePerCapacity) {
            return 1;
        }

        if (otherPricePerCapacity > pricePerCapacity) {
            return -1;
        }

        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return price < other.getPrice();
    }

    @Override
    public String toString() {
        return name + ", " + capacity + ", " + price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}
