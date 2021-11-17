package introexceptionthrow;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("A név nem  lehet üres!");
        }
        this.name = name;

        socialSecurityNumber = ssn;

        if (year < 1900) {
            throw new IllegalArgumentException("A születési idő nem lehet régebbi, mint 1900");
        }
        yearOfBirth = year;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {

        Patient patient = new Patient("Pisti", "154564654865", 1999);
        System.out.println("A páciens adatai:");
        System.out.println("Név: " + patient.getName());
        System.out.println("TAJ szám:" + patient.getSocialSecurityNumber());
        System.out.println("Születési év: " + patient.getYearOfBirth());

        Patient patient2 = new Patient("Pisti", "154564654865", 1899);
        System.out.println("A páciens adatai:");
        System.out.println("Név: " + patient2.getName());
        System.out.println("TAJ szám:" + patient2.getSocialSecurityNumber());
        System.out.println("Születési év: " + patient2.getYearOfBirth());

        Patient patient3 = new Patient("", "154564654865", 1999);
        System.out.println("A páciens adatai:");
        System.out.println("Név: " + patient3.getName());
        System.out.println("TAJ szám:" + patient3.getSocialSecurityNumber());
        System.out.println("Születési év: " + patient3.getYearOfBirth());
    }
}
