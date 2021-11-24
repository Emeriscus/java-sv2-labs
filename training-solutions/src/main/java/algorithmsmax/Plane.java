package algorithmsmax;

public class Plane {

    private String map = "10000000111110000000000001111111111000010000010000100000111111110000101000000000111110000000000000000100000001000000000000111111000000000100000000000011";

    public int getLongestOcean(String map) {

        int count = 1;
        int maxcount = 0;

        for (int i = 0; i < map.toCharArray().length; i++) {
            if (map.toCharArray()[i] == '0' && map.toCharArray()[i + 1] == '0') {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                }
            } else {
                count = 1;
            }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        Plane plane = new Plane();

        System.out.println(plane.getLongestOcean(plane.map));
    }
}
