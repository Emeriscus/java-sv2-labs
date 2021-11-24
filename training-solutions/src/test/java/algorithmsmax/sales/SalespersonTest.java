package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    void createSalesPersonTest() {

        Salesperson salesperson = new Salesperson("Joe", 150_000, 200_000);

        assertEquals("Joe", salesperson.getName());
        assertEquals(150_000, salesperson.getAmount());
        assertEquals(200_000, salesperson.getTarget());
    }
}