package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {


    @Test
    void withoutAccentsTest() {

        WithoutAccents withoutAccents = new WithoutAccents();
        char letter = withoutAccents.withoutAccents('á');

        assertEquals('a', letter);

    }
}
