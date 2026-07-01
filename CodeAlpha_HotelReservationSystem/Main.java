import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("   HOTEL RESERVATION SYSTEM");
            System.out.println("====================================");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View All Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    hotel.viewAvailableRooms();
                    break;

                case 2:

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Room Number: ");
                    int roomNumber = sc.nextInt();

                    hotel.bookRoom(name, phone, roomNumber);

                    break;

                case 3:

                    System.out.print("Enter Booking ID: ");
                    int bookingId = sc.nextInt();

                    hotel.cancelBooking(bookingId);

                    break;

                case 4:

                    hotel.viewBookings();

                    break;

                case 5:

                    System.out.println("\nThank You for using Hotel Reservation System!");

                    break;

                default:

                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
