package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    @Test
    void greetingtest() {
        Greetings greetings = new Greetings();
        String result = greetings.greetings(5, 1);
        assertEquals("jó reggelt", result);
    }
}
