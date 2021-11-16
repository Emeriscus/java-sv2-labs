package introexceptiontrycatchtrace;

import java.util.*;

public class Winner {

    private List<String> people= Arrays.asList("Peti", "Pisti", null, "Joci");
    Random rnd = new Random();

    public String getWinner(){
        return people.get(rnd.nextInt(people.size())).toUpperCase();
    }
}
