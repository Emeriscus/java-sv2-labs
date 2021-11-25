package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrimeTest() {
        Prime prime = new Prime();

        assertTrue(prime.isPrime(17));
        assertFalse(prime.isPrime(6));
    }
}