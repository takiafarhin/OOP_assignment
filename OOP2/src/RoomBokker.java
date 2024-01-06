public class RoomBokker {
    Customer customer;
    Room room;
    boolean isAvailable;


    public RoomBokker(Customer customer, Room room, int numberOfRooms, String checkInDate, String checkOutDate, String typeOfRoom, String status, String name, String address, String phoneNumber, String email, String creditCardNumber) {
        this.customer = customer;
        this.room = room;
        this.isAvailable = isAvailable;

    }

    public void statusChecking() {
        if (room.status == "Available") {
            isAvailable = true;
            System.out.println("Room is available");
        } else {
            isAvailable = false;
            System.out.println("Room is not available");
        }
    }

    public void roomBooking() {
        if (isAvailable == true) {
            System.out.println("Room is booked");
        } else {
            System.out.println("Room is not booked");
        }

    }

    public void cancelBooking(){
        if(isAvailable!=true){
            System.out.println("Room is cancelled");
        }
        else{
            System.out.println("Room is not cancelled");
        }
    }
}