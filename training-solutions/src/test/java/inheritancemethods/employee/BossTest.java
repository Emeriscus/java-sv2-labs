package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void createBossTest() {
        Boss boss = new Boss("Jim", "Bp", 350_000, 25);

        assertEquals("Jim", boss.getName());
        assertEquals("Bp", boss.getAddress());
        assertEquals(25, boss.getNumberOfEmployees());
    }

    @Test
    void getSalaryTest() {
        Boss boss = new Boss("Jim", "Bp", 350_000, 25);

        assertEquals(1_225_000, boss.getSalary(), 0.00001);
    }
}