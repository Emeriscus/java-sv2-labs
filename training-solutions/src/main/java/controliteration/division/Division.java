package controliteration.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int num = scanner.nextInt();

        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int division = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % division == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        int assist = 1;
        while (assist <= num) {
            if (assist % division == 0) {
                System.out.print(assist + ", ");
            }
            assist++;
        }
    }
}
