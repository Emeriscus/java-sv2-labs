package searching;

import java.time.LocalDate;

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
    public int compareTo(LostProperty o) {
        if (description.compareTo(o.description) != 0) {
            return description.compareTo(o.description);
        } else {
            return dateOfFound.compareTo(o.dateOfFound);
        }
    }
}
