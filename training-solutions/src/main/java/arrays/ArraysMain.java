package arrays;

import java.net.InetSocketAddress;
import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String numbdays = Arrays.toString(numberOfDays);
        return numbdays;
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiple = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiple[i][j] = (i+1) * (j+1);
            }
        }
    return Arrays.deepToString(multiple);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }
    public int min (int dayLength, int anotherDayLength) {
        int min;
        if (dayLength > anotherDayLength) {
            min = anotherDayLength;
        } else {
            min = dayLength;
        }
        return min;
    }
    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        return Arrays.equals(Arrays.copyOfRange(day, 0, min(day.length, anotherDay.length)), Arrays.copyOfRange(anotherDay, 0, min(day.length, anotherDay.length)));
    }

    public boolean wonLottery(int[] bet, int[] win) {
        int[] betAssist = bet;
        int[] winAssist = win;

        Arrays.sort(betAssist);
        Arrays.sort(winAssist);

        return Arrays.equals(betAssist, winAssist);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println(arraysMain.multiplicationTableAsString(5));

        double[] day = {12.1, 13.0, 12.9, 12.9, 13.0, 13.5, 14.2, 14.8, 15.4, 16.9, 18.0, 19.0, 21.0, 22.0, 23.5, 25.1, 26.0, 27.0, 26.1, 25.0, 23.0, 21.0, 18.0, 14.1};
        double[] anotherDay = {12.1, 13.0, 12.9, 12.9, 13.0, 13.5, 14.2, 14.8, 15.4, 16.9, 18.0, 19.0, 21.0, 22.0, 23.5, 25.1, 26.0, 27.0, 26.1, 25.0, 23.0, 21.0, 18.0, 14.1};
        System.out.println(arraysMain.sameTempValues(day, anotherDay));
        double[] day2 = {12.0, 13.0, 12.9, 12.9, 13.0, 13.5, 14.2, 14.8, 15.4, 16.9, 18.0, 19.0, 21.0, 22.0, 23.5, 25.1, 26.0, 27.0, 26.1, 25.0, 23.0, 21.0, 18.0, 14.1};
        double[] anotherDay2 = {12.1, 13.0, 12.9, 12.9, 13.0, 13.5, 14.2, 14.8, 15.4, 16.9, 18.0, 19.0, 21.0, 22.0, 23.5, 25.1, 26.0, 27.0, 26.1, 25.0, 23.0, 21.0, 18.0, 14.1};
        System.out.println(arraysMain.sameTempValues(day2, anotherDay2));

        double[] day3 = {12.1, 13.0, 12.9, 12.9, 13.0, 13.5, 14.2, 14.8, 15.4, 16.9, 18.0, 19.0, 21.0, 22.0, 23.5, 25.1, 26.0, 27.0, 26.1, 25.0, 23.0, 21.0, 18.0, 14.1};
        double[] anotherDay3 = {12.1, 13.0, 12.9, 12.9, 13.0, 13.5, 14.2, 14.8, 15.4, 16.9, 18.0, 19.0, 21.0, 22.0, 23.5, 25.1, 26.0, 27.0, 26.1, 25.0, 23.0, 21.0, 18.0, 14.1, 13.9};
        System.out.println(arraysMain.sameTempValuesDaylight(day3, anotherDay3));
        double[] day4 = {12.0, 13.0, 12.9, 12.9, 13.0, 13.5, 14.2, 14.8, 15.4, 16.9, 18.0, 19.0, 21.0, 22.0, 23.5, 25.1, 26.0, 27.0, 26.1, 25.0, 23.0, 21.0, 18.0, 14.1};
        double[] anotherDay4 = {12.1, 13.0, 12.9, 12.9, 13.0, 13.5, 14.2, 14.8, 15.4, 16.9, 18.0, 19.0, 21.0, 22.0, 23.5, 25.1, 26.0, 27.0, 26.1, 25.0, 23.0, 21.0, 18.0, 14.1, 13.9};
        System.out.println(arraysMain.sameTempValuesDaylight(day4, anotherDay4));

        int[] bet = {6, 52, 89, 3, 21};
        int[] win = {52, 3, 21, 6, 89};
        System.out.println(arraysMain.wonLottery(bet, win));
        System.out.println(Arrays.toString(bet));
        System.out.println(Arrays.toString(win));

    }
}
