package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    List<BankAccount> bankAccounts = Arrays.asList(
            new BankAccount("Joe", "1234", 160_000),
            new BankAccount("Jill", "2222", 150_000),
            new BankAccount("Jane", "3333", 180_000),
            new BankAccount("Jim", "4444", 155_000));

    @Test
    void containsBalanceGreaterThanTest() {

        BankAccountDecisionMaker bankAccountDecisionMaker = new BankAccountDecisionMaker();

        assertTrue(bankAccountDecisionMaker.containsBalanceGreaterThan(bankAccounts, 155_000));
        assertFalse(bankAccountDecisionMaker.containsBalanceGreaterThan(bankAccounts, 180_000));
    }
}