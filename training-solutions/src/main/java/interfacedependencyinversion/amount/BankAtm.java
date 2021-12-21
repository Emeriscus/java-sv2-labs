package interfacedependencyinversion.amount;

public class BankAtm implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        if (amount % 1000 != 0) {
            return amount - amount % 1000 + 1000;
        }
        return amount;
    }
}
