package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    BodyMass bodyMass = new BodyMass(80, 1.6);


    @Test
    void getBodyMassIndexTest() {
        assertEquals(31.25, bodyMass.getBodyMassIndex(), 0.00005);
    }

    @Test
    void isThinnerThanTest() {

        BodyMass otherBodyMass = new BodyMass(75, 1.6);

        assertFalse(bodyMass.isThinnerThan(otherBodyMass));
    }

    @Test
    void getBodyTest() {
        assertEquals(BmiCategory.OVERWEIGHT, bodyMass.getBody());
    }
}
