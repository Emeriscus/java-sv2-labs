package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void getDeletedFlights() {
        StringBuilder delFlightList = new StringBuilder("Törölt járatok:\r\n");
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getStatus().equals(Status.DELETED)) {
                delFlightList.append(flights.get(i).getFlightnumber() + "\r\n");
            }
        }
        System.out.println(delFlightList);
    }

    public static void main(String[] args) {

        Airport airport = new Airport();
        Flight flight1 = new Flight("B-25828", Status.ACTIVE);
        Flight flight2 = new Flight("C-1111", Status.ACTIVE);
        Flight flight3 = new Flight("A-232328", Status.ACTIVE);

        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);

        airport.addFlight(new Flight("D-98784", Status.DELETED));

        flight2.setStatus(Status.DELETED);

        System.out.println(airport.flights);
        System.out.println(airport.flights.get(0));
        System.out.println(airport.flights.get(0).getFlightnumber());

        System.out.println();
        airport.getDeletedFlights();


    }
}
