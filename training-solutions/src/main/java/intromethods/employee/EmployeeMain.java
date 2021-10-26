package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee = new Employee("Jancsi", 1977, 320_000);

        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());

        employee.raiseSalary(80_000);
        System.out.println(employee.getSalary());

        System.out.println(employee.toString());

    }
}
