package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2));
        for (int i = 2; i < 7; i++) {
            int j = (elements.get(i - 1)) * (elements.get(i - 2));
            elements.add(j);
        }

        System.out.println(elements.toString());
        System.out.println(elements.size());
    }
}
