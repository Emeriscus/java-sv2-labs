package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a számlatulajdonos nevét:");
        String owner = scanner.nextLine();

        System.out.println("Kérem a számlaszámot:");
        String accountNumber = scanner.nextLine();

        System.out.println("Kérem az aktuális egyenleget:");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);

        /* BankAccount bankAccount = new BankAccount("114-25", "Pocsai", 100000); */
        System.out.println();
        System.out.print("A bankszámla adatai: ");
        System.out.println(bankAccount.getInfo());

        System.out.println();
        System.out.println("Mennyi a befizetés a számlára?");
        balance = scanner.nextInt();
        bankAccount.deposit(balance);
        System.out.println("Az új egyenleg: " + bankAccount.getBalance()+ " Ft");

        System.out.println();
        System.out.println("Mennyi a pénzkivétel a számláról?");
        balance = scanner.nextInt();
        bankAccount.withdraw(balance);
        System.out.println("Az új egyenleg: " + bankAccount.getBalance()+ " Ft");

        System.out.println();
        System.out.print("A bankszámla aktuális adatai: ");
        System.out.println(bankAccount.getInfo());
    }
}
