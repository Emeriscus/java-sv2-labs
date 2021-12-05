package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    @Test
    void createBigBoss() {
        BigBoss bigBoss = new BigBoss("Jane", "Peru", 500_000, 26, 150_000);

        assertEquals("Jane", bigBoss.getName());
        assertEquals("Peru", bigBoss.getAddress());
        assertEquals(26, bigBoss.getNumberOfEmployees());
        assertEquals(150_000, bigBoss.getBonus());
    }


    @Test
    void getSalaryTest() {
        BigBoss bigBoss = new BigBoss("Jane", "Peru", 500_000, 26, 150_000);

        assertEquals(1_950_000, bigBoss.getSalary(), 0.00001);
    }
}