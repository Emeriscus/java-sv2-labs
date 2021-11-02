package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy összetett mondatot: ");
        Scanner s = new Scanner(scanner.nextLine());
        while (s.hasNext()) {
            System.out.println(s.next());
        }

        System.out.println();
        System.out.println("Kérek egy másik összetett mondatot: ");
        Scanner s1 = new Scanner(scanner.nextLine());

        s1.useDelimiter(", ");

        while (s1.hasNext()) {
            System.out.println(s1.next());
        }
    }
}
