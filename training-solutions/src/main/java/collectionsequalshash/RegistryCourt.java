package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();
        companies.add(new Company("aaa", "1234-5678"));
        companies.add(new Company("bbb", "1234-1234"));
        companies.add(new Company("ccc", "5678-5678"));

        System.out.println(companies.contains(new Company("aaa", "1234-5678")));
        System.out.println(companies.contains(new Company("bbb", "1234-1234")));
        System.out.println(companies.contains(new Company("ccc", "5678-5678")));

    }
}
