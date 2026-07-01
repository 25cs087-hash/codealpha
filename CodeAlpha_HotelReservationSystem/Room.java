public class Room {

    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isAvailable;

    // Constructor
    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isAvailable = true;
    }

    // Getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room Number : " + roomNumber +
               "\nRoom Type   : " + roomType +
               "\nPrice       : ₹" + price +
               "\nAvailable   : " + (isAvailable ? "Yes" : "No");
    }
}
