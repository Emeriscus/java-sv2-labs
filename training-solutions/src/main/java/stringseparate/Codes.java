package stringseparate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes {

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder("Betűvel kezdődő kódok: ");
        for (int i = 0; i < codes.size(); i++) {
            if (i == 0) {
                if (Character.isAlphabetic(codes.get(i).charAt(0))) {
                    sb.append(codes.get(i));
                }
            } else {
                if (Character.isAlphabetic(codes.get(i).charAt(0))) {

                    if (sb.toString().equals("Betűvel kezdődő kódok: ")) {
                        sb.append(codes.get(i));
                    } else {
                        sb.append(", " + codes.get(i));
                    }

                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> codes = Arrays.asList(".erjoe23cv@&fd", "dfffe", "22wrre", "@erw.344.", "eféléui}{");

        Codes codes1 = new Codes();

        System.out.println(codes1.getCodesStartWithLetter(codes));
    }

}
