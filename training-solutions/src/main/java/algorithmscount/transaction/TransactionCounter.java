package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int limit) {

        int count = 0;

        for (Transaction actual : transactions) {
            if (actual.getTransactionType() == TransactionType.CREDIT && actual.getAmount() < limit) {
                count++;
            }
        }
        return count;
    }
}
