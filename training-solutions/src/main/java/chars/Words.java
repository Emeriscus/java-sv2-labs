package chars;

public class Words {

    public void pushWord(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] ++;
        }
        System.out.println(new String(chars));
//      System.out.println(String(chars));    -----------> így miért nem jó??
    }

    public static void main(String[] args) {

        Words words = new Words();
        String word = "alma";
        words.pushWord(word);
    }
}
