package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    Office office = new Office();
    Scanner scanner = new Scanner(System.in);
    int choice;

    public void readOffice() {

        System.out.println("Kérem a hozzáadandó tárgyaló adatait!");

        System.out.println("Neve: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Hossza méterben:");
        int length = scanner.nextInt();

        System.out.println("Szélessége méterben");
        int width = scanner.nextInt();
        MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
        office.addMeetingRoom(meetingRoom);
    }

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése");
        System.out.println("2. Tárgyalók sorrendben");
        System.out.println("3. Tárgyalók visszafele sorrendben");
        System.out.println("4. Minden második tárgyaló");
        System.out.println("5. Területek");
        System.out.println("6. Keresés pontos név alapján");
        System.out.println("7. Keresés névtöredék alapján");
        System.out.println("8. Keresés terület alapján");
        System.out.println("9. Kilépés");
        choice = scanner.nextInt();
    }

    public void runMenu() {
        do {
            printMenu();
            switch (choice) {
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.println("Kérem a tárgyaló nevét:");
                    scanner.nextLine();
                    office.printMeetingRoomsWithName(scanner.nextLine());
                    break;
                case 7:
                    System.out.println("Kérem a névtöredéket:");
                    scanner.nextLine();
                    office.printMeetingRoomsContains(scanner.nextLine());
                    break;
                case 8:
                    System.out.println("Kérem azt a területet m2-ben, aminél a nagyobb területű tárgyalókat listázni fogom:");
                    scanner.nextLine();
                    office.areasLargerThan(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 9:
                default:
                    break;
            }
        } while (choice != 9);
    }

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();

        meetingRoomController.runMenu();

        System.out.println(meetingRoomController.office.getMeetingRooms());
        System.out.println(meetingRoomController.office.getMeetingRooms().toString());
        System.out.println();
        System.out.println(meetingRoomController.office);
        System.out.println(meetingRoomController.office.toString());
        System.out.println();
        System.out.println(meetingRoomController.office.getMeetingRooms().get(0).getName());


    }
}
