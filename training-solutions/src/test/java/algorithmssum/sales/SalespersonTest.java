package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    void createSalesPersonTest() {

        Salesperson salesperson = new Salesperson("Joe", 100_000);

        assertEquals("Joe", salesperson.getName());
        assertEquals(100_000, salesperson.getAmount());
    }
}