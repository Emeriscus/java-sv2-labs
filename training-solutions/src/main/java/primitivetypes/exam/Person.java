package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birth;
    private int zipCode;
    double average;

    public Person(String name, LocalDate birth, int zipCode, double average) {
        this.name = name;
        this.birth = birth;
        this.zipCode = zipCode;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "A vizsgára jelentkező - " +
                "név: " + name +
                ", születés: " + birth +
                ", irányítószám: " + zipCode +
                ", átlag: " + average
                ;
    }
}
