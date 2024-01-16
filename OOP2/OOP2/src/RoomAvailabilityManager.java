public class RoomAvailabilityManager {
    public void checkAvailability(Room room) {
        if (room.numberOfRooms != 0) {
            room.status = "Available";
            room.numberOfRooms--;
        } else {
            room.status = "Not Available";
        }
    }
}
