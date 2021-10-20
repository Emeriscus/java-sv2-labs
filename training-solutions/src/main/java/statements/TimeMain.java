package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Az első időpont órája?");
        int hour = scanner.nextInt();
        System.out.println("Az első időpont perce?");
        int minute = scanner.nextInt();
        System.out.println("Az első időpont másodperce?");
        int second = scanner.nextInt();

        Time time1 = new Time(hour, minute, second);

        System.out.println("Az második időpont órája?");
        hour = scanner.nextInt();
        System.out.println("Az második időpont perce?");
        minute = scanner.nextInt();
        System.out.println("Az második időpont másodperce?");
        second = scanner.nextInt();

        Time time2 = new Time(hour, minute, second);

        System.out.println("Az első időpont " + time1.toString() + " = " + time1.getInMinutes());

        System.out.println("Az második időpont " + time1.toString() + " = " + time1.getInSeconds());

        System.out.println("Az első korábbi, mint a második: " + time1.earlierThan(time2));


    }
}
