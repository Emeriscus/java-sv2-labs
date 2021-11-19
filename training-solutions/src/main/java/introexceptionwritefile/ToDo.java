package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> toDo = new ArrayList<>();
        String temp = "";

        do {
            System.out.println("Adj hozzá egy teendőt a napi listádhoz!" +
                    "\r\nHa már nem akarsz hozzáadni semmit, nyomj 'x'-et");
            temp = scanner.nextLine();

            if (!(temp.equals("x"))) {
                toDo.add(temp);
            }

        } while (!(temp.equals("x")));

        try {
            Files.write(Paths.get("todos.txt"), toDo);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
