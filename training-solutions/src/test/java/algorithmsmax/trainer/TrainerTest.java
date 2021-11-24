package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void createTrainerTest() {

        Trainer trainer = new Trainer("joe", 52);

        assertEquals("joe", trainer.getName());
        assertEquals(52, trainer.getAge());
    }
}