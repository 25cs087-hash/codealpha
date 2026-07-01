public class Booking {

    private static int bookingCounter = 1001;

    private int bookingId;
    private Customer customer;
    private Room room;

    // Constructor
    public Booking(Customer customer, Room room) {
        this.bookingId = bookingCounter++;
        this.customer = customer;
        this.room = room;
    }

    // Getters
    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {

        return "\n========== BOOKING RECEIPT ==========\n" +
                "Booking ID   : " + bookingId + "\n" +
                "Customer     : " + customer.getName() + "\n" +
                "Phone Number : " + customer.getPhoneNumber() + "\n" +
                "Room Number  : " + room.getRoomNumber() + "\n" +
                "Room Type    : " + room.getRoomType() + "\n" +
                "Room Price   : ₹" + room.getPrice() + "\n" +
                "=====================================\n";
    }
}
