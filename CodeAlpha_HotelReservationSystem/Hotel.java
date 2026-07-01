import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();

    // Constructor
    public Hotel() {

        rooms.add(new Room(101, "Standard", 1500));
        rooms.add(new Room(102, "Standard", 1500));
        rooms.add(new Room(201, "Deluxe", 2500));
        rooms.add(new Room(202, "Deluxe", 2500));
        rooms.add(new Room(301, "Suite", 5000));
    }

    // View Available Rooms
    public void viewAvailableRooms() {

        System.out.println("\n===== AVAILABLE ROOMS =====");

        boolean available = false;

        for (Room room : rooms) {

            if (room.isAvailable()) {
                System.out.println(room);
                System.out.println("----------------------------");
                available = true;
            }
        }

        if (!available) {
            System.out.println("No Rooms Available.");
        }
    }

    // Book Room
    public void bookRoom(String customerName, String phone, int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {

                Customer customer = new Customer(customerName, phone);

                Booking booking = new Booking(customer, room);

                bookings.add(booking);

                room.setAvailable(false);

                System.out.println("\nPayment Successful!");
                System.out.println("Room Booked Successfully!");

                System.out.println(booking);

                return;
            }
        }

        System.out.println("Room Not Available!");
    }

    // Cancel Booking
    public void cancelBooking(int bookingId) {

        for (Booking booking : bookings) {

            if (booking.getBookingId() == bookingId) {

                booking.getRoom().setAvailable(true);

                bookings.remove(booking);

                System.out.println("Booking Cancelled Successfully!");

                return;
            }
        }

        System.out.println("Booking ID Not Found!");
    }

    // View All Bookings
    public void viewBookings() {

        if (bookings.isEmpty()) {

            System.out.println("No Bookings Found.");

            return;
        }

        System.out.println("\n======= ALL BOOKINGS =======");

        for (Booking booking : bookings) {

            System.out.println(booking);
        }
    }
}
