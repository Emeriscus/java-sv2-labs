package algorithmssum.sales;

import algorithmssum.sales.SalesAmountSumCalculator;
import algorithmssum.sales.Salesperson;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void sumSalesAmountTest() {

        List<Salesperson> salespersons = new ArrayList<>();

        salespersons.add(new Salesperson("Joe", 23000));
        salespersons.add(new Salesperson("Jack", 35000));
        salespersons.add(new Salesperson("Jill", 50000));
        salespersons.add(new Salesperson("Jane", 20000));

        assertEquals(128000, new SalesAmountSumCalculator().SumSalesAmount(salespersons));
    }
}