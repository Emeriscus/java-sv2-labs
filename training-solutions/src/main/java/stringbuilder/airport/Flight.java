package stringbuilder.airport;

public class Flight {

    private String flightnumber;
    private Status status;

    public Flight(String flightnumber, Status status) {
        this.flightnumber = flightnumber;
        this.status = status;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
