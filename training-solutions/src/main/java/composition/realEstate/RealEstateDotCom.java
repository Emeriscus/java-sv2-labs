package composition.realEstate;

public class RealEstateDotCom {
    public static void main(String[] args) {

        RealEstate realEstate = new RealEstate("Álmaid háza", 35_000_000,
                new Details("Ház a Balaton partján",
                        new Address("Zánka", "2500", "Fő út", 14),
                        105, 500));

        System.out.println(realEstate.toString());
        System.out.println();

        Address address = new Address("Bp", "1100", "Váczi út", 12);
        Details details = new Details("A város szívében", address, 75, 75);

        RealEstate anotherRealEstate = new RealEstate("Fővárosi lakás", 20000000, details);
        System.out.println(anotherRealEstate.toString());

    }
}
