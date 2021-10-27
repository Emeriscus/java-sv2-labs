package composition.person;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("Pocsi", "1980");
        System.out.println(person.personToString());

        person.correctData("Pocsai", "1977");
        System.out.println(person.personToString());

        person.moveToAddress(new Address("Hun", "Bp", "Váczi 1.", "1100"));
        System.out.println(person.getAddress().addresToString());
//        System.out.println(person.getAddress().getCity());
//        System.out.println(person.personToString().toUpperCase());


    }
}
