package exceptionclass.bank;

public class Account {

    private String accountNumber;
    private double balance;
    private double MaxSubtract = 100_000;

    public Account(String accountNumber, double balance) {

        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number should not be null!");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return MaxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract < 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.MaxSubtract = maxSubtract;
    }

    public double subtract(double amount) {
        if (isValidAmount(amount) && isEnoughBalance(amount)) {
            return balance -= amount;
        }
        return balance;
    }

    public double deposit(double amount) {
        if (isValidAmount(amount)) {
            return balance += amount;
        }
        return balance;
    }

    private boolean isValidAmount(double amount) {
        boolean isValidAmount = true;
        if (!(amount > 0 && amount <= MaxSubtract)) {
            isValidAmount = false;
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        return isValidAmount;
    }

    private boolean isEnoughBalance(double amount) {
        boolean isEnoughBalance = true;
        if (!(balance >= amount)) {
            isEnoughBalance = false;
            throw new LowBalanceBankOperationException("Low balance!");
        }
        return isEnoughBalance;
    }
}
