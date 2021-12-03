package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void createRoomTest() {
        Room room = new Room("alagsor", 100);

        assertEquals(100, room.getCapacity());
        assertEquals("alagsor", room.getLocation());
    }
}