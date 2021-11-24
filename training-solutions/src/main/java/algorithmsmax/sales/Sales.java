package algorithmsmax.sales;

import java.util.Arrays;
import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {

        Salesperson salesPersonWithMaxSalesAmount = sales.get(0);

        for (Salesperson actual : sales) {
            if (actual.getAmount() > salesPersonWithMaxSalesAmount.getAmount())
                salesPersonWithMaxSalesAmount = actual;
        }
        return salesPersonWithMaxSalesAmount;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {

        Salesperson salesPersonWithFurthestAboveTarget = sales.get(0);
        int maxPositiveDifferenceTargetAndAmount = Integer.MIN_VALUE;

        for (Salesperson actual : sales) {
            if ((actual.getAmount() - actual.getTarget()) > maxPositiveDifferenceTargetAndAmount) {
                salesPersonWithFurthestAboveTarget = actual;
                maxPositiveDifferenceTargetAndAmount = actual.getAmount() - actual.getTarget();
            }
        }
        return salesPersonWithFurthestAboveTarget;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {

        Salesperson salesPersonWithFurthestAboveTarget = sales.get(0);
        int maxNegativeDifferenceTargetAndAmount = Integer.MIN_VALUE;

        for (Salesperson actual : sales) {
            if ((actual.getTarget() - actual.getAmount()) > maxNegativeDifferenceTargetAndAmount) {
                maxNegativeDifferenceTargetAndAmount = actual.getTarget() - actual.getAmount();
                salesPersonWithFurthestAboveTarget = actual;
            }
        }
        return salesPersonWithFurthestAboveTarget;
    }

    public static void main(String[] args) {
        Sales sales = new Sales();
        List<Salesperson> salespersons = Arrays.asList(
                new Salesperson("Joe", 130_000, 200_000),
                new Salesperson("Jack", 150_000, 200_000),
                new Salesperson("Jill", 210_000, 200_000),
                new Salesperson("Jane", 150_000, 160_000),
                new Salesperson("Jim", 130_000, 100_000));

        System.out.println(sales.selectSalesPersonWithFurthestBelowTarget(salespersons).getName());
    }
}
