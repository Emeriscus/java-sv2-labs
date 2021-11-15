package introexceptionmoreexceptions;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person\r\n" +
                "name: " + name +
                ", age : " + age +
                '}';
    }

    public static void main(String[] args) {

        Person person = new Person(null, 32);

        System.out.println(person);
        System.out.println();

        System.out.println(person.getName());
        System.out.println();

        System.out.println(person.getName().toUpperCase());
        // A toUpperCase nem hajtható végre nuul-on!!

    }
}
