package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    Payable amount = new Amount();
    Payable cash = new Cash();
    Payable atm = new BankAtm();

    @Test
    void getPayableAmountByAmount() {
        assertEquals(12_345, amount.getPayableAmount(12_345));
    }

    @Test
    void getPayableAmountByCash() {
        assertEquals(12_340, cash.getPayableAmount(12_340));
        assertEquals(12_340, cash.getPayableAmount(12_341));
        assertEquals(12_340, cash.getPayableAmount(12_342));

        assertEquals(12_345, cash.getPayableAmount(12_343));
        assertEquals(12_345, cash.getPayableAmount(12_344));
        assertEquals(12_345, cash.getPayableAmount(12_345));
        assertEquals(12_345, cash.getPayableAmount(12_346));
        assertEquals(12_345, cash.getPayableAmount(12_347));

        assertEquals(12_350, cash.getPayableAmount(12_348));
        assertEquals(12_350, cash.getPayableAmount(12_349));
    }

    @Test
    void getPayableAmountByAtm() {
        assertEquals(13_000, atm.getPayableAmount(12_001));
        assertEquals(13_000, atm.getPayableAmount(12_999));
        assertEquals(12_000, atm.getPayableAmount(12_000));
        assertEquals(1_000, atm.getPayableAmount(999));
    }
}