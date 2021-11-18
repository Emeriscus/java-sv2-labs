package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Neptun {

    private List<String> datas = new ArrayList<>();
    private List<String> neptunCodes =new ArrayList<>();

    public List<String> readFile() throws IOException{
            datas = Files.readAllLines(Paths.get("neptun.csv"));

            for (String actual: datas){
                String[] temp = actual.split(",");
                neptunCodes.add(temp[1]);
            }
        return neptunCodes;
    }

    public static void main(String[] args) {

        Neptun neptun=new Neptun();

        try {
            System.out.println(neptun.readFile());
        }catch (IOException ioe){
            System.out.println("Nem létező fájl, vagy útvonal.");
            ioe.printStackTrace();
        }
    }
}
