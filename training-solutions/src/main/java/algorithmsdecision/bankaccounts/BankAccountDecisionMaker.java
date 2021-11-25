package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min) {
        boolean result = false;

        for (BankAccount actual : accounts) {
            if (actual.getBalance() > min) {
                result = true;
            }
        }
        return result;
    }
}
