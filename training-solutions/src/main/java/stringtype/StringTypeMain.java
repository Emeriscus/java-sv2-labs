package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String space = "" + "";
        System.out.println(space);
        System.out.println(space.length());

        System.out.println("Abcde".length());
        System.out.println("Abcde".substring(0, 1) + ", " + "Abcde".substring(2, 3));
        System.out.println("Abcde".substring(0, 3));

    }
}
