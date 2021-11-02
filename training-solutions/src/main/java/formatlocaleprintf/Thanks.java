package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {

        List<String> personsName = Arrays.asList("Pisti", "Zoli", "Tibi", "Gejza");

        for (int i = 0; i < personsName.size(); i++) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!\r\n", personsName.get(i));
        }
    }
}
