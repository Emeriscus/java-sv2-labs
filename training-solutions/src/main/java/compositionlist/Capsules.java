package compositionlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capsules {

    private List<String> colours = new ArrayList<>();

    public void addFirst(String colour) {
        colours.add(0, colour);
    }

    public void addLast(String colour) {
        colours.add(colour);
    }

    public void removeFirst() {
        colours.remove(0);
    }

    public void removeLast() {
            colours.remove(colours.size() - 1);
        }

    public List<String> getColors() {
        return colours;
    }

    public static void main(String[] args) {

        Capsules capsules = new Capsules();
        capsules.addFirst("Grey");
        capsules.addFirst("Green");
        capsules.addLast("Black");
        capsules.addLast("White");
        capsules.addFirst("Purple");


        System.out.println(capsules.getColors());

        capsules.removeLast();

        System.out.println(capsules.getColors());


        capsules.removeFirst();
        System.out.println(capsules.getColors());
    }
}
