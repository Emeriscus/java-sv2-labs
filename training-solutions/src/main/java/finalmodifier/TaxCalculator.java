package finalmodifier;

public class TaxCalculator {

    public static final double ÁFA = 0.27;

    public double tax(double price) {
        return price * ÁFA;
    }
    public double priceWithTax(double price) {
        return price * (1 +ÁFA);
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        double price = 10000;
        System.out.println("Az ÁFA: " + taxCalculator.tax(price) + " Ft");
        System.out.println("Az ÁFA-val növelt végösszeg: " + taxCalculator.priceWithTax(price) + " Ft");

    }
}
