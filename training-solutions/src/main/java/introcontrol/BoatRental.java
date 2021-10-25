package introcontrol;

public class BoatRental {
    public static void main(String[] args) {

        int persons;
        int emptyPlaces;
        persons = 8;

        if (persons <= 2) {
            System.out.println("A kétszemélyes csónakot vitték el, még 8 fő tud kihajózni.");
        } else {
            if (persons == 3) {
                System.out.println("A háromszemélyes csónakot vitték el, még 7 fő tud kihajózni.");
            } else {
                if (persons <= 5) {
                    System.out.println("Az ötszemélyes csónakot vitték el, még 5 fő tud kihajózni.");
                } else {
                    if (persons <= 7) {
                        System.out.println("Az öt- és a kétszemélyes csónakot vitték el, még 3 fő tud kihajózni.");
                    } else {
                        if (persons == 8) {
                            System.out.println("Az öt- és a háromszemélyes csónakot vitték el, még 2 fő tud kihajózni.");
                        } else {
                            if (persons <= 10) {
                                System.out.println("Az összes csónakot elvitték. Nincs szabad hely.");
                            } else {
                                System.out.println("Az összes csónakot elvitték. A parton maradt " + (persons - 10) + " fő.");
                            }
                        }
                    }
                }
            }
        }
    }
}
