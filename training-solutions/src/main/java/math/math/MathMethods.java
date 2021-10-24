package math.math;

import java.util.Random;

public class MathMethods {
    public static void main(String[] args) {

        System.out.println(Math.max(2, 3));
        System.out.println(Math.min(2, 3));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(123.5675));
        System.out.println(Math.abs(-125));
        System.out.println(Math.negateExact(1));
        System.out.println(Math.addExact(5, 5));
        System.out.println(Math.subtractExact(3, 7));
        System.out.println(Math.multiplyExact(5, 5));
        System.out.println(Math.pow(2, 5));
        System.out.println(Math.incrementExact(5));
        System.out.println(Math.decrementExact(5));

        Random rnd = new Random();
        System.out.println(rnd.nextDouble());
    }
}
