package controlselection.accents;

public class WithoutAccents {

    String charWithAccent = "áéíöőúű";
    String charWithoutAccent = "aeioouu";


    public char withoutAccents(char letter) {
        char result = ' ';
        if (charWithAccent.contains(new String(String.valueOf(letter)))) {
            for (int i = 0; i < charWithAccent.length(); i++) {
                if (charWithAccent.charAt(i) == letter) {
                    result = charWithoutAccent.charAt(i);
                }
            }
        } else result = letter;

        return result;
    }


}
