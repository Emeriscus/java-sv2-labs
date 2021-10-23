package cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {

        for ( String verse : args) {
            System.out.print(verse);
        }

        System.out.println();

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }

    }


}
