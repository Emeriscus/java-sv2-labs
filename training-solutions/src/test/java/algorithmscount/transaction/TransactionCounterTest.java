package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void countEntryLessThanTest() {

        TransactionCounter transactionCounter = new TransactionCounter();
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1234", TransactionType.CREDIT, 15_000),
                new Transaction("1234", TransactionType.CREDIT, 14_999),
                new Transaction("1234", TransactionType.CREDIT, 12_000),
                new Transaction("1234", TransactionType.DEBIT, 16_000),
                new Transaction("1234", TransactionType.DEBIT, 11_500));

        assertEquals(2, transactionCounter.countEntryLessThan(transactions, 15_000));
        assertEquals(3, transactionCounter.countEntryLessThan(transactions, 17_000));
    }
}
