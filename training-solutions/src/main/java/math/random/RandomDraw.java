package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Peti", "Pisti", "Juci", "Ági", "Feri", "Géza", "Enikő", "Andi", "Imi", "Marcsi"));
        Random rnd = new Random();
        int rndOneToFive = rnd.nextInt(5);
        int rndSixToTen = 5 + rnd.nextInt(5);

        System.out.println(names.get(rndOneToFive));
        System.out.println(names.get(rndSixToTen));
    }



}
