package classstructuremethods;

import classstructureattributes.Song;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client();
        client.setName("Kovács László");
        client.setYear(1990);
        client.setAddress("Szolnok");

        System.out.println("Az ügyfél adatai:");
        System.out.println("Név: " + client.getName());
        System.out.println("Az ügyfél születési éve: " + client.getYear());
        System.out.println("Az ügyfél életkora: " + client.getAge(2021));
        System.out.println("Az ügyfél címe: " + client.getAddress());

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Az ügyfél új címe?");
        client.migrate(scanner.nextLine());
        System.out.println("A változtatás sikeres!");
        System.out.println("Az ügyfél új címe: " + client.getAddress());

    }
}
