package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public String getProduct() {
        return this.product;
    }

    public int getStock() {
        return this.stock;
    }

    public Store(String product) {
        this.product = product;
    }

    public void store(int ammount) {
        this.stock = this.stock + ammount;
    }

    public void dispatch(int ammount) {
        this.stock = this.stock - ammount;
    }

}
