package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("Joe", 130_000, 200_000),
            new Salesperson("Jack", 150_000, 200_000),
            new Salesperson("Jill", 210_000, 200_000),
            new Salesperson("Jane", 130_000, 100_000),
            new Salesperson("Jim", 150_000, 160_000));

    @Test
    void selectSalesPersonWithMaxSalesAmountTest() {
        Sales sales = new Sales();
        Salesperson expected = sales.selectSalesPersonWithMaxSalesAmount(salespersons);

        assertEquals("Jill", expected.getName());
    }

    @Test
    void selectSalesPersonWithFurthestAboveTargetTest() {
        Sales sales = new Sales();
        Salesperson expected = sales.selectSalesPersonWithFurthestAboveTarget(salespersons);

        assertEquals("Jane", expected.getName());
    }

    @Test
    void selectSalesPersonWithFurthestBelowTarget() {
        Sales sales = new Sales();
        Salesperson expected = sales.selectSalesPersonWithFurthestBelowTarget(salespersons);

        assertEquals("Joe", expected.getName());
    }
}