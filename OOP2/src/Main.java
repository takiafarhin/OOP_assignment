
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John", "123 Main St", "1234567890", "abc", "1234567890", "12/12/2020",
                "12/13/2020", "Deluxe", 1);
        Room room = new Room("Delux", "Available", 1);
        GamingRoom gamingRoom = new GamingRoom(customer, 2, 10);
        Landary landary = new Landary("Shirt", 10);
        LandaryOrder landaryOrder = new LandaryOrder(customer, 2, 10, landary);
        RoomBokker roomBokker = new RoomBokker(customer, room, 1, "12/12/2020", "12/13/2020", "Deluxe", "Available",
                "John", "123 Main St", "1234567890", "abc", "1234567890");
        customer.isVIP();
        roomBokker.statusChecking();
        roomBokker.roomBooking();
        roomBokker.cancelBooking();
        System.out.println("Bill for Gaming Room: " + gamingRoom.generateBill());
        System.out.println("Bill for Landary Order: " + landaryOrder.generateBill());


    }

}