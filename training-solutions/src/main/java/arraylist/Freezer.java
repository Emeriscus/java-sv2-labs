package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Freezer {

    public void add(List freezer, String add) {
        freezer.add(add);
    }
    public void remove(List freezer, String remove) {
        freezer.remove(remove);
    }

    public static void main(String[] args) {

        Freezer freezer = new Freezer();
        List<String> freezerContains = new ArrayList<>();
        freezerContains.add ("hal");
        freezerContains.add ("kenyér");
        freezerContains.add ("tej");
        freezerContains.add ("zöldbab");
        freezerContains.add ("meggy");

        System.out.println(freezerContains.toString());
        System.out.println(freezerContains.size());

        freezer.remove(freezerContains, "zöldbab");

        freezer.remove(freezerContains, "hal");

        System.out.println();
        System.out.println(freezerContains.toString());
        System.out.println(freezerContains.size());
    }
}
