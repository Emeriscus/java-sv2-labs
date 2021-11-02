package stringseparate;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {

    public void iceCreamsByFirst(List<String> iceCreams) {
        StringBuilder sb = new StringBuilder("Finom fagylaltok féláron: ");
        for (int i = 0; i < iceCreams.size(); i++) {
            if (i == 0) {
                sb.append(iceCreams.get(i));
            } else {
                sb.append(", " + iceCreams.get(i));
            }
        }
        sb.append(".\r\nCsak a mai napon!");
        System.out.println(sb);
    }

    public void iceCreamsByLast(List<String> iceCreams) {
        StringBuilder sb = new StringBuilder("Finom fagylaltok féláron: ");
        for (int i = 0; i < iceCreams.size(); i++) {
            if (i == iceCreams.size() - 1) {
                sb.append(iceCreams.get(i));
            } else {
                sb.append(iceCreams.get(i) + ", ");
            }
        }
        sb.append(".\r\nCsak a mai napon!");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        List<String> iceCreams = Arrays.asList("eper", "málna", "csoki", "pisztácia", "vanília");

        IceCream iceCream = new IceCream();

        System.out.println();
        iceCream.iceCreamsByFirst(iceCreams);

        System.out.println();
        iceCream.iceCreamsByLast(iceCreams);
    }
}
