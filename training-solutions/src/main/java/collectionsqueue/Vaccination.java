package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {

        Queue<Integer> result = new PriorityQueue<>();
        for (Person actual : people) {
            if (actual.getAge() <= 65 && actual.getAge() >= 18) {
                result.add(actual.getAge());
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Vaccination vaccination = new Vaccination();
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Joe", 66));
        persons.add(new Person("Joe", 65));
        persons.add(new Person("Joe", 64));
        persons.add(new Person("Joe", 17));
        persons.add(new Person("Joe", 18));
        persons.add(new Person("Joe", 19));
        persons.add(new Person("Joe", 25));
        persons.add(new Person("Joe", 32));
        persons.add(new Person("Joe", 73));
        persons.add(new Person("Joe", 12));

        Queue<Integer> orderedPerson = new PriorityQueue<>();
        orderedPerson = vaccination.getVaccinationOrder(persons);
        System.out.println(orderedPerson);
        System.out.println();

        System.out.println(orderedPerson.poll());
        System.out.println(orderedPerson.poll());
        System.out.println(orderedPerson.poll());
        System.out.println(orderedPerson.poll());
        System.out.println(orderedPerson.poll());
        System.out.println(orderedPerson.poll());
        System.out.println(orderedPerson.poll());

    }

}
