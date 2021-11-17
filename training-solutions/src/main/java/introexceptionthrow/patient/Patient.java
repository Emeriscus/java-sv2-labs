package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;
    SsnValidator ssnValidator = new SsnValidator();

    public Patient(String name, String ssn, int year) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("A név nem  lehet üres!");
        }
        this.name = name;

        try {
            int i=Integer.parseInt(ssn);
        } catch (NumberFormatException nfe){
            System.out.println("A TAJ számnak számokból kell állnia!");
        }

        try {
            ssnValidator.isValidSsn(ssn);
            this.socialSecurityNumber = ssn;
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        if (year < 1900) {
            throw new IllegalArgumentException("A születési idő nem lehet régebbi, mint 1900");
        }
        this.yearOfBirth = year;
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

//        Patient patient = new Patient("Pisti", "131101513", 1999);
//
//        System.out.println();
//        System.out.println("A páciens adatai:");
//        System.out.println("Név: " + patient.getName());
//
//        System.out.print("TAJ szám: ");
//        if (patient.getSocialSecurityNumber() == null){
//            System.out.println("hibás!");
//        }else{
//            System.out.println(patient.getSocialSecurityNumber());
//        }
//
//        System.out.println("Születési év: " + patient.getYearOfBirth());
//        System.out.println();

        Patient patient2 = new Patient("Madonna", "12345678i", 1989);
        System.out.println("A páciens adatai:");
        System.out.println("Név: " + patient2.getName());

        System.out.print("TAJ szám: ");
        if (patient2.getSocialSecurityNumber() == null){
            System.out.println("hibás!");
        }else{
            System.out.println(patient2.getSocialSecurityNumber());
        }

        System.out.println("Születési év: " + patient2.getYearOfBirth());
        System.out.println();

        Patient patient3 = new Patient("Józsi", "131101513", 1899);
        System.out.println();
        System.out.println("A páciens adatai:");
        System.out.println("Név: " + patient3.getName());

        System.out.print("TAJ szám: ");
        if (patient3.getSocialSecurityNumber() == null){
            System.out.println("hibás!");
        }else{
            System.out.println(patient3.getSocialSecurityNumber());
        }

        System.out.println("Születési év: " + patient3.getYearOfBirth());
    }
}
