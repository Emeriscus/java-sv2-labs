package collectionsequalshash;

import java.util.Objects;

public class Company {

    private String name;
    private String vatNumber;

    public Company(String name, String vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }

    public String getName() {
        return name;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return name.equals(company.name) && vatNumber.equals(company.vatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vatNumber);
    }
}
