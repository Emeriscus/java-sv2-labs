package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance distance = new Distance(153.12,false);

        System.out.println(distance.getDistancelnKm());
        System.out.println(distance.isExact());

        int distanceToInt = (int) distance.getDistancelnKm();
        System.out.println(distanceToInt);
        
    }
}
