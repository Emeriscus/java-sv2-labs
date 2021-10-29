package chars;

public class Whitespace {

    public void makeWhitespaceToStar(String text) {

        char[] chars = text.toCharArray();

        for (char c : chars) {
            if (Character.isWhitespace(c)) {
                c = '*';
            }
        }

//        for (int i = 0; i < chars.length; i++) {
//            if (Character.isWhitespace(chars[i])) {
//                chars[i] = '*';
//            }
//        }

        System.out.println(new String(chars));
    }

    public static void main(String[] args) {

        String text = "a c\n2\rd f g h3";
        Whitespace whitespace = new Whitespace();
        whitespace.makeWhitespaceToStar(text);

    }

}
