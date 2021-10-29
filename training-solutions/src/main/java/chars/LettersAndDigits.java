package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {

        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                System.out.println(c + ": betű");
            } else {
                if (Character.isDigit(c)) {
                    System.out.println(c + ": számjegy");
                } else {
                    System.out.println(c + ": egyéb karakter");
                }
            }
        }
    }

    public static void main(String[] args) {

        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        String s = "kjd54 5h35@5j.h";
        lettersAndDigits.printLetterOrDigit(s);
    }
}
