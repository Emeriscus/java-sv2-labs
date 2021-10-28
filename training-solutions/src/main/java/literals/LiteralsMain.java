package literals;

import java.util.Locale;

public class LiteralsMain {

    public static void main(String[] args) {
        System.out.println("1" + "2");
        System.out.println(1 + "2");
        System.out.println("1" + 2);
        System.out.println(1 + "" + 2);
        System.out.println(Integer.toString(1) + Integer.toString(2));


        double quotient = 3 / 4;
        System.out.println(quotient);

        quotient = 3.0 / 4;
        System.out.println(quotient);

        quotient = 3 / 4d;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);

        String bin1 = Integer.toBinaryString(1);
        String bin2 = Integer.toBinaryString(-2);

        System.out.println(bin1);
        System.out.println(bin2);


    }
}




