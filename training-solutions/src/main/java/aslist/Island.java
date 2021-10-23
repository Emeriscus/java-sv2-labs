package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {

        List<String> importantThings = Arrays.asList("telefon", "gyufa", "könyv");

        System.out.println("Ezeket vinném egy lakatlan szigetre:");
        System.out.println(importantThings.toString());

        importantThings.set(2, "még egy telefon");

        System.out.println();
        System.out.println("A végleges listám:");

        System.out.println(importantThings.toString());




    }
}
