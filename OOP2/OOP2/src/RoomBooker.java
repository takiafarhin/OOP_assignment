public class RoomBooker {
    boolean isAvailable;

    public void statusChecking(Room room) {
        if (room.status.equals("Available")) {
            isAvailable = true;
            System.out.println("Room is available");
        } else {
            isAvailable = false;
            System.out.println("Room is not available");
        }
    }

    public void roomBooking(Room room) {
        if (isAvailable) {
            System.out.println("Room is booked");
        } else {
            System.out.println("Room is not booked");
        }
    }

    public void cancelBooking(Room room) {
        if (!isAvailable) {
            System.out.println("Room is cancelled");
        } else {
            System.out.println("Room is not cancelled");
        }
    }
}