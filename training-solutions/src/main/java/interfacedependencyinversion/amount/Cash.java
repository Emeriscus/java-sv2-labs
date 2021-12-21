package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {

        switch (amount % 10) {
            case 1:
            case 2:
                return amount - amount % 10;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return amount - amount % 10 + 5;
            case 8:
            case 9:
                return amount - amount % 10 + 10;
        }
        return amount;
    }
}
