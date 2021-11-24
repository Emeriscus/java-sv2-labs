package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int SumSalesAmount(List<Salesperson> salesperson) {
        int sum = 0;

        for (Salesperson actual : salesperson) {
            sum += actual.getAmount();
        }
        return sum;
    }
}
