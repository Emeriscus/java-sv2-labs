package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {

        Person person1;
        Person person2;

        person1 = new Person("Józsi", 22);
        person2 = person1;

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        person2.setName("Juci");

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        int num1 = 24;
        int num2 = num1;
        num2++;

        System.out.println(num1);
        System.out.println(num2);

        Person personNew = new Person("Gizi", 40);

        person1 = personNew;

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(personNew);

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(personNew.getName());


    }
}
