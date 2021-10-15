package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
            System.out.println("Regisztráció");
            Client client01 = new Client();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kérem az ügyfél nevét: ");
            client01.name = scanner.nextLine();
            System.out.println("Kérem az ügyfél születési évét: ");
            client01.year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérem az ügyfél címét: ");
            client01.address = scanner.nextLine();

            System.out.println("A regisztrált személy adatai:");
            System.out.println("Neve: " + client01.name);
            System.out.println("Születési éve: " + client01.year);
            System.out.println("Címe : " + client01.address);

        }
}
