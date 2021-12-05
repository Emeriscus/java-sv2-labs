package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Joe", 30000);

        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlane());

        PriorityPassenger priorityPassenger = new PriorityPassenger("Jim", 30000, 15);
        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPercent());
        System.out.println(priorityPassenger.getPriceOfPlane());

        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Jane", 30000, 15);
        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPercent());
        System.out.println(firstClassPassenger.getExtraCharge());
        System.out.println(firstClassPassenger.getPriceOfPlane());
    }
}
