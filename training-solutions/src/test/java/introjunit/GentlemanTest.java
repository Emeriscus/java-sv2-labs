package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GentlemanTest {

    @Test

    public void testHello() {
        Gentleman gentleman = new Gentleman();

        String s = gentleman.sayHello("Pocsai");

        assertThat (s, equalTo("Hello Pocsai"));

        assertThat(gentleman.sayHello(null),equalTo("Hello Anonymus"));
    }
}
