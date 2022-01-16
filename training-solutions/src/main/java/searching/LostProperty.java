package searching;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {

    private String regNumber;
    private String description;
    private LocalDate dateOfFound;

    public LostProperty(String regNumber, String description, LocalDate dateOfFound) {
        this.regNumber = regNumber;
        this.description = description;
        this.dateOfFound = dateOfFound;
    }

    public LostProperty(String description, LocalDate dateOfFound) {
        this.description = description;
        this.dateOfFound = dateOfFound;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateOfFound() {
        return dateOfFound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return description.equals(that.description) && dateOfFound.equals(that.dateOfFound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dateOfFound);
    }

    @Override
    public int compareTo(LostProperty o) {
        if (description.compareTo(o.description) != 0) {
            return description.compareTo(o.description);
        } else {
            return dateOfFound.compareTo(o.dateOfFound);
        }
    }
}
