package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void createTransactionTest() {

        Transaction transaction = new Transaction("1234", TransactionType.CREDIT, 12_500);

        assertEquals("1234", transaction.getAccountNumber());
        assertEquals(TransactionType.CREDIT, transaction.getTransactionType());
        assertEquals(12_500, transaction.getAmount());
    }

}