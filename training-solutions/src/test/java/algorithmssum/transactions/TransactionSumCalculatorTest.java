package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    void sumAmountOfCreditEntriesTest() {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("123456789", TransactionOperation.CREDIT, 20000),
                new Transaction("123456789", TransactionOperation.DEBIT, 20000),
                new Transaction("123456789", TransactionOperation.CREDIT, 50000),
                new Transaction("123456789", TransactionOperation.CREDIT, 30000)
        );

        assertEquals(100_000, new TransactionSumCalculator().sumAmountOfCreditEntries(transactions));
    }

}