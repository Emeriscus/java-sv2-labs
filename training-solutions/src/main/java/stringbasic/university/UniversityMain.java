package stringbasic.university;

public class UniversityMain {

    public static void main(String[] args) {

        University university = new University();

        Person person1 = new Person("Pocsai", "emeriscus@gmail.com",
                "135-135-135", "1251-1212-1212-1212", "702222222");
        Person person2 = new Person("Kal-el", "kal-el@gmail.com",
                "135-135-133", "1111-1111-1111-1111", "301000100");

        Student student = new Student(person1, "555_555", "111-111-111");
        Student student1 = new Student(person2, "555_555", "111-111-111");
        Student student2 = new Student(person1, "555-554", "111-111-111");

        student.setEntryCard(123456789);

        System.out.println(student.getEntryCard());
        System.out.println(student.getPerson().getName());

        university.areEqual(student, student1);
        university.areEqual(student1, student2);
    }
}
