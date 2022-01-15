package collectionsequalshash;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String SocialSecurityNumber;

    public Person(String name, int age, String socialSecurityNumber) {
        this.name = name;
        this.age = age;
        SocialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return SocialSecurityNumber.equals(person.SocialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SocialSecurityNumber);
    }

    public static void main(String[] args) {

        Person person = new Person("Joe", 20, "1234-5678");
        Person anotherPerson = new Person("Jack", 30, "1234-5678");

        System.out.println(person.equals(anotherPerson));
        System.out.println(person.hashCode());
        System.out.println(anotherPerson.hashCode());
    }
}
