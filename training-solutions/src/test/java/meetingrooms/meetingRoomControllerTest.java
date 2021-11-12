package meetingrooms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class meetingRoomControllerTest {

    Office office = new Office();

    @BeforeEach
    void init() {
        office.addMeetingRoom(new MeetingRoom("Jupiter", 5, 4));
        office.addMeetingRoom(new MeetingRoom("Juno", 10, 10));
        office.addMeetingRoom(new MeetingRoom("Mars", 6, 8));
        office.addMeetingRoom(new MeetingRoom("Martin", 4, 6));
        office.addMeetingRoom(new MeetingRoom("Saturn", 8, 4));
        office.addMeetingRoom(new MeetingRoom("Moon", 7, 5));
    }

    @Test
    void addMeetingRoom() {
        assertEquals("Hell", new MeetingRoom("Hell", 2, 3).getName());
    }
}
