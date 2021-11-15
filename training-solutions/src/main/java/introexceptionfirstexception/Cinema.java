package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public void lineAndTicketPrint(int amountOfTicket, int lineOfTickets) {
        for (int i = 1; i <= amountOfTicket; i++) {
            if (i < amountOfTicket) {
                System.out.print(lineOfTickets + ". sor " + i + ". szék, ");
            } else {
                System.out.println(lineOfTickets + ". sor " + i + ". szék");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String costumerName;
        String movieTitle;
        int amountOfTicket;
        int lineOfTickets;

        Cinema cinema = new Cinema();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a vásárló nevét:");
        costumerName = scanner.nextLine();

        System.out.println("Kérem a film címét:");
        movieTitle = scanner.nextLine();

        System.out.println("Mennyi jegyet kér:");
        amountOfTicket = scanner.nextInt();

        System.out.println("Hanyadik sorba kéri a jegy(ek)et:");
        lineOfTickets = scanner.nextInt();

        System.out.println();
        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");

        System.out.println("Vásárló neve: " + costumerName);

        System.out.println("Film címe: " + movieTitle);

        System.out.print("Lefoglalt helyek: ");
        cinema.lineAndTicketPrint(amountOfTicket, lineOfTickets);

        System.out.println("Jó szórakozást!");
    }
}
