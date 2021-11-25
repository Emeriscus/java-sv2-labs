package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount("Joe", "1234-5678", 150_000);

    @Test
    void createBankAccountTest() {
        assertEquals("Joe", bankAccount.getNameOfOwner());
        assertEquals("1234-5678", bankAccount.getAccountNumber());
        assertEquals(150_000, bankAccount.getBalance());
    }

    @Test
    void withdrawTest() {
        bankAccount.withdraw(50_000);

        assertEquals(100_000, bankAccount.getBalance());
    }

    @Test
    void depositTest() {
        bankAccount.deposit(60_000);

        assertEquals(210_000, bankAccount.getBalance());
    }
}