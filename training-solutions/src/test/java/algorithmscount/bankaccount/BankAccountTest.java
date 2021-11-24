package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void createBankAccountTest() {

        BankAccount bankAccount = new BankAccount("Joe", "1234-5678-9012", 1_950_000);

        assertEquals("Joe", bankAccount.getNameOfOwner());
        assertEquals("1234-5678-9012", bankAccount.getAccountNumber());
        assertEquals(1_950_000, bankAccount.getBalance());
    }
}