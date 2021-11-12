package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }


    public void printNames() {
        for (MeetingRoom actual : meetingRooms) {
            System.out.println(actual.toString());
        }
        System.out.println("Tovább bármelyik billentyűvel");
        scanner.nextLine();
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
        System.out.println("Tovább bármelyik billentyűvel");
        scanner.nextLine();
    }

    public void printEvenNames() {
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
        System.out.println("Tovább bármelyik billentyűvel");
        scanner.nextLine();
    }

    public void printAreas() {
        for (MeetingRoom actual : meetingRooms) {
            System.out.println(actual.toString() + ", területe: " + actual.getArea() + " m2");
        }
        System.out.println("Tovább bármelyik billentyűvel");
        scanner.nextLine();

    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom actual : meetingRooms) {
            if (name.equals(actual.getName())) {
                System.out.println(actual.toString() + ", területe: " + actual.getArea() + " m2");
            }
        }
        System.out.println("Tovább bármelyik billentyűvel");
        scanner.nextLine();
    }

    public void printMeetingRoomsContains(String part) {
        List<MeetingRoom> result = new ArrayList<>();
        for (MeetingRoom actual : meetingRooms) {
            if (actual.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.println(actual.toString() + ", területe: " + actual.getArea() + " m2");
            }
        }
        System.out.println("Tovább bármelyik billentyűvel");
        scanner.nextLine();
    }

    public void areasLargerThan(int area) {
        for (MeetingRoom actual : meetingRooms) {
            if (actual.getArea() > area) {
                System.out.println(actual.toString() + ", területe: " + actual.getArea() + " m2");
            }
        }
        System.out.println("Tovább bármelyik billentyűvel");
        scanner.nextLine();
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    @Override
    public String toString() {
        return "Office{" +
                "meetingRooms=" + meetingRooms +
                '}';
    }
}
