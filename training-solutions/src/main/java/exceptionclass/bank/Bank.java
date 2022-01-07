package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {
        if (isExistingAccountNumber(accountNumber)) {
            for (Account actual : accounts) {
                if (accountNumber.equals(actual.getAccountNumber())) {
                    actual.subtract(amount);
                }
            }
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (isExistingAccountNumber(accountNumber)) {
            for (Account actual : accounts) {
                if (accountNumber.equals(actual.getAccountNumber())) {
                    actual.deposit(amount);
                }
            }
        }
    }

    private boolean isExistingAccountNumber(String accountNumber) {
        for (Account actual : accounts) {
            if (accountNumber.equals(actual.getAccountNumber())) {
                return true;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Invalid account number!");
    }
}
