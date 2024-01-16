
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rahul", "Kolkata", "1234567890", "@abc", "1234567890123456", "12/12/2021", "13/12/2021", "Deluxe", 1);
        Room room = new Room("Deluxe", "Available", 1);
        room.isAvailable();
        System.out.println("Room status is "+room.status);
        Delux delux = new Delux("Deluxe", "Available", 1, 1000, true, true, true, true);
        RoomBooker roomBokker = new RoomBooker(customer, new Room("Deluxe", "Available", 1), 1, "12/12/2021", "13/12/2021", "Deluxe", "Available", "Rahul", "Kolkata", "1234567890", "@abc", "1234567890123456");
        roomBokker.statusChecking();
        roomBokker.roomBooking();
        GamingRoom gamingRoom = new GamingRoom(customer, 2, 100);
        System.out.println("Gaming room bill is "+gamingRoom.generateBill());
        DayCareCenter dayCareCenter = new DayCareCenter("Deluxe", 100, 2, 2);
        System.out.println("Daycare center bill is" +dayCareCenter.generateBill());
        LandaryOrder landaryOrder = new LandaryOrder(customer, 2, 100, new Landary("wash", 100));
        System.out.println("landary bill is" + landaryOrder.generateBill());
        PoolToken poolToken = new PoolToken(customer, 2, 100);
        System.out.println("Pool token bill is" + poolToken.generateBill());
        double roomBill = delux.price;
        double totalBill = gamingRoom.generateBill() + dayCareCenter.generateBill() + landaryOrder.generateBill() + poolToken.generateBill()+ roomBill;
        System.out.println("Total bill is  " + totalBill);
        roomBokker.cancelBooking();

    }

}