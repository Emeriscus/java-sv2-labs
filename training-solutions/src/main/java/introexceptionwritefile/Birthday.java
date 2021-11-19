package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> dataOfPesons = new ArrayList<>();
        Path path = Paths.get("src/main/resources/birthdays.txt");

        System.out.println("Hány személy adatait kivánja rögzíteni?");
        int numsOfPesons = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numsOfPesons; i++) {
            StringBuilder sb = new StringBuilder();
            System.out.println("Kérem a(z) " + i + ". nevet:");
            sb.append(scanner.nextLine() + " ");
            System.out.println("Kérem a születési idejét:");
            sb.append(scanner.nextLine());
            dataOfPesons.add(sb.toString());
        }

        try {
            Files.write(path, dataOfPesons);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
