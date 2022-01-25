package streamsalgorithms;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ccc", 1980));
        employees.add(new Employee("aaa", 1960));
        employees.add(new Employee("eee", 1968));
        employees.add(new Employee("zzz", 1991));
        employees.add(new Employee("aaa", 1991));
        employees.add(new Employee("kkk", 2001));

        int sumOfYearOfBirths = 0;
        sumOfYearOfBirths = employees
                .stream()
                .mapToInt(Employee::getYearOfBirth)
                .sum();
        System.out.println(sumOfYearOfBirths);

        int sumOfAges = employees
                .stream()
                .mapToInt(Employee::getYearOfBirth)
                .map(birth -> LocalDate.now().getYear() - birth)
                .sum();
        System.out.println(sumOfAges);

        long sumOfEmployees = employees
                .stream()
                .count();
        System.out.println(sumOfEmployees);


        long sumOfOlderThan1990 = employees
                .stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .count();
        System.out.println(sumOfOlderThan1990);

        int getYongestEmloyee = employees
                .stream()
                .mapToInt(Employee::getYearOfBirth)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println(getYongestEmloyee);

        String nameOfYoungestEmployee = employees
                .stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return Integer.valueOf(o1.getYearOfBirth()).compareTo(Integer.valueOf(o2.getYearOfBirth()));
                    }
                })
                .map(Employee::getName)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println(nameOfYoungestEmployee);

        boolean before = employees
                .stream()
                .allMatch(employee -> employee.getYearOfBirth() < 1990);
        System.out.println(before);

        List<Employee> olderThan1990 = employees
                .stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .collect(Collectors.toList());
        System.out.println(olderThan1990);

        List<String> allEmloyee = employees
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(allEmloyee);

        List<String> allEmloyeeEarlierThan1990 = employees
                .stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(allEmloyeeEarlierThan1990);

    }
}
