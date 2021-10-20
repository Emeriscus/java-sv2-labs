package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a befektetett öszzeget:");
        int amount = scanner.nextInt();

        System.out.println("Kérem a kamatlábat");
        int rate = scanner.nextInt();

        Investment investment = new Investment(amount, rate);

        System.out.println();
        System.out.println("Mennyi napig akarja kiszámolni kamatot:");
        int day = scanner.nextInt();

        System.out.println("A tőke: " + investment.getFund());
        System.out.println("Hozam " + day + " napra: " + investment.getYield(day));

        System.out.println("Hány nap múlva veszi ki a befektetést: ");
        int finalDay = scanner.nextInt();
        System.out.println("A kivett összeg " + finalDay + " nap után: " + investment.close(finalDay));

    }
}
