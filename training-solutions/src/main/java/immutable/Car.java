package immutable;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String type;
    private final int yearOfProduct;

    public Car(String brand, String type, int yearOfProduct) {

        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            throw new IllegalArgumentException("The brand is not valid!");
        }

        if (yearOfProduct <= LocalDate.now().getYear()) {
            this.yearOfProduct = yearOfProduct;
        } else {
            throw new IllegalArgumentException("Invalid year of product!");
        }

        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }
}
