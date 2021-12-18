package initializer;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard {

    private long balance;
    private static final List<Rate> rates = new ArrayList<>();

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public CreditCard(long balance, Currency currency, List<Rate> rates) {
        this.rates.addAll(rates);
        this.balance = Math.round(balance * getConversionRate(currency));
    }

    public long getBalance() {
        return balance;
    }

    public double getConversionRate(Currency currency) {
        for (Rate actual : rates) {
            if (actual.getCurrency() == currency) {
                return actual.getConversionFactor();
            }
        }
        return 1.0;
    }

    public boolean payment(long amount, Currency currency) {
        long value = Math.round(amount * getConversionRate(currency));
        if (balance >= value) {
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
