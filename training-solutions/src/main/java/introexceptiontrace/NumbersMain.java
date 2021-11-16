package introexceptiontrace;

import java.util.Arrays;

public class NumbersMain {

    public static void main(String[] args) {

        Change change = new Change();

        System.out.println(Arrays.toString(change.changeNumbers()));
        // int i = 0; i <= lengthOfArray; i++ az egyenlőség is meg van engedve, így a tömb méretén kívülre akar menni
    }
}
