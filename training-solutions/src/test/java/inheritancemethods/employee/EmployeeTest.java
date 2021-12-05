package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void createEmployee() {
        Employee employee = new Employee("Joe", "Bp", 220_000);

        assertEquals("Joe", employee.getName());
        assertEquals("Bp", employee.getAddress());
        assertEquals(220_000, employee.getSalary());
    }

    @Test
    void raiseSalaryTest() {
        Employee employee = new Employee("Joe", "Bp", 220_000);

        employee.raiseSalary(15);
        assertEquals(253_000, employee.getSalary(), 0.00001);
    }
}