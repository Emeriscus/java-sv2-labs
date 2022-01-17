package sorting;

import java.time.LocalDateTime;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private LocalDateTime bookedTime;

    public Patient(String name, String socialSecurityNumber, LocalDateTime bookedTime) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.bookedTime = bookedTime;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public LocalDateTime getBookedTime() {
        return bookedTime;
    }
}
