package immutable;

import java.time.LocalDate;

public class Monument {

    private final String name;
    private final String title;
    private final LocalDate dateOfRegistry;
    private final String regNumber;


    private boolean isEmpty(String text) {

        if (text == null || text.isBlank()) {
            return false;
        }
        return true;
    }

    public Monument(String name, String title, LocalDate dateOfRegistry, String regNumber) {

        if (!isEmpty(name)) {
            throw new IllegalArgumentException("The name cannot be empty!");
        }
        if (!isEmpty(title)) {
            throw new IllegalArgumentException("The title cannot be empty!");
        }
        if (!isEmpty(regNumber)) {
            throw new IllegalArgumentException("The registry number cannot be empty!");
        }
        if (dateOfRegistry.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("The date of registry cannot be after now!");
        }

        this.name = name;
        this.title = title;
        this.dateOfRegistry = dateOfRegistry;
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDateOfRegistry() {
        return dateOfRegistry;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
