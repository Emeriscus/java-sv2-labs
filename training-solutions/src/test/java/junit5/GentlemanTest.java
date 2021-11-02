package junit5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
     void testHello() {
        Gentleman gentleman = new Gentleman();

        String s = gentleman.sayHello("John Doe");

        assertEquals("Hello John Doe", s);

        assertEquals("Hello Anonymus", gentleman.sayHello(null));
    }


}
