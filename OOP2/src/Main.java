
public class Main {
    public static void main(String[] args) {
        RoomAvailabilityManager roomAvailabilityManager = new RoomAvailabilityManager();
        Single single = new Single("Single", "Available", 10, 100, true, true);
        roomAvailabilityManager.checkAvailability(single);
        System.out.println(single.status);
        System.out.println(single.numberOfRooms);
        System.out.println(single.hasFreeWifi);
        System.out.println(single.hasAirConditioner);
        System.out.println(single.price);
        Customer customer = new Customer("John", "Doe", " 1234567890", "@abc", "1234567890", "12/1/24", "12/1/24", "Single", 1);
        System.out.println(customer.name);
        RoomBooker roomBooker = new RoomBooker();
        roomBooker.roomBooking(single);
        DayCareCenter dayCareCenter = new DayCareCenter("Single", 1, 5, 5);
        double daycarebill = dayCareCenter.generateBill();
        System.out.println("Daycare bill=" + daycarebill);
        GamingRoom gamingRoom = new GamingRoom(customer, 1, 5);
        double gamingbill = gamingRoom.generateBill();
        System.out.println("Gaming bill=" + gamingbill);
        gymToken gymToken = new gymToken("pushup", 1, 5);
        double gymTokenbill = gymToken.generateBill();
        System.out.println("Gym bill=" + gymTokenbill);
        Landary landary = new Landary("wash", 1);
        LandaryOrder landaryOrder = new LandaryOrder(customer, 1, 5, landary);
        double landarybill = landaryOrder.generateBill();
        System.out.println("Landary bill=" + landarybill);
        PoolToken poolToken = new PoolToken(customer, 1, 5);
        double poolTokenbill = poolToken.generateBill();
        System.out.println("Pool bill=" + poolTokenbill);
        double totalbill = daycarebill + gamingbill + gymTokenbill + landarybill + poolTokenbill + single.price;
        System.out.println("Total bill=" + totalbill);
        roomBooker.cancelBooking(single);

    }
}