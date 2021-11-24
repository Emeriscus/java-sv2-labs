package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    void countWithBalanceGreaterThanTest() {

        BankAccountConditionCounter bankAccountConditionCounter = new BankAccountConditionCounter();
        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("Joe", "1234-5236-8475", 1_500_000),
                new BankAccount("Jack", "1111-2222-3333", 1_200_000),
                new BankAccount("Jill", "1234-5678-9012", 1_200_001),
                new BankAccount("Jane", "9876-5432-1098", 1_400_000),
                new BankAccount("Jim", "1111-2222-3333", 900_000));

        assertEquals(3, bankAccountConditionCounter.countWithBalanceGreaterThan(bankAccounts, 1_200_000));
        assertEquals(1, bankAccountConditionCounter.countWithBalanceGreaterThan(bankAccounts, 1_400_000));
    }
}