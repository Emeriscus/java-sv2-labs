package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.Lastname;
import packages.prefix.Prefix;

public class Namemain {
    public static void main(String[] args) {

        Prefix prefix = new Prefix("Dr.");

        FirstName firstName = new FirstName("Kovács");

        Lastname lastname = new Lastname("László");

        String fullName = prefix.getPre() + " " + firstName.getFirst() + " " + lastname.getLast();

        System.out.println(fullName);
    }
}
