package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void createTransactionTest() {

        Transaction transaction = new Transaction("1234-5678", TransactionOperation.CREDIT, 20000);

        assertEquals("1234-5678", transaction.getAccountNumber());
        assertEquals(TransactionOperation.CREDIT, transaction.getTransactionOperation());
        assertEquals(20_000, transaction.getAmount());
    }
}