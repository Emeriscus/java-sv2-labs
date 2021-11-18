package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Underground {

    public static void main(String[] args) {

        Operations operations=new Operations();
        List<String> metroCarsData = new ArrayList<>();

        try {
            metroCarsData = new Operations().readFile();
        } catch (IOException ioe){
            System.out.println("Nem létező fájl, vagy útvonal.");
            ioe.printStackTrace();
        }

        System.out.println(operations.getDailySchedule(metroCarsData));
    }
}
