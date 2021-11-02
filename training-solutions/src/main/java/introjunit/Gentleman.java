package introjunit;

import javax.swing.*;

public class Gentleman {

    public String sayHello(String name) {

        if (name == null) {
            return "Hello Anonymus";
        } else {
            return "Hello " + name;
        }
    }
}
