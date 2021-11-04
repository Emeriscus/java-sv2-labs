package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány elemű Fibonacci sorozatot szeretne?");
        int assist = scanner.nextInt();
        int[] fibonaccis = new int[assist];

        fibonaccis[1] = 1;

//        for (int i = 2; i < fibonaccis.length; i++) {
//            fibonaccis[i] = fibonaccis[i-1] + fibonaccis[i-2];
//        }
//
//        System.out.println(Arrays.toString(fibonaccis));
//        System.out.println();

        int i = 2;
        while (i != assist) {
            fibonaccis[i] = fibonaccis[i-1] + fibonaccis[i-2];
            i++;

        }
        System.out.println(Arrays.toString(fibonaccis));
        System.out.println();

    }
}
