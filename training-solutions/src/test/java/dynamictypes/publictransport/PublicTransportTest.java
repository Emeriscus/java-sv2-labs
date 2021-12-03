package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void publicVehiclesTest() {
        PublicTransport publicTransport = new PublicTransport();

        PublicVehicle bus = new Bus(24, 20, "Ikarus");
        PublicVehicle tram = new Tram(50, 25, 3);
        PublicVehicle metro = new Metro(3, 45, 20);

        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicleList().size());
    }
}