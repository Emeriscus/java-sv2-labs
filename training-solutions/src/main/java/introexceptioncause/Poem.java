package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {

    public List<String> poemLines(Path path) {

        try {
            return Files.readAllLines(path);

        } catch (IOException ioe) {
            throw new IllegalStateException("Nem létező fájl, vagy útvonal.", ioe);
        }
    }

    public String firstLetterOfPoemLines(List<String> poemlines){

        StringBuilder sb=new StringBuilder();

        for (String actual : poemlines){
            sb.append(actual.substring(0, 1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Poem poem = new Poem();
        Path path =Paths.get("src/main/resources/poem.txt");

        try {
            System.out.println(poem.firstLetterOfPoemLines(poem.poemLines(path)));

        }catch (IllegalStateException ise){
            System.out.println(ise.getMessage());
            System.out.println(ise.getCause().getMessage());
        }
    }
}
