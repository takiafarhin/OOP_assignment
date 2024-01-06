public class Single extends Room{
    double price;
    boolean hasFreeWifi=true;

    boolean hasAirConditioner=true;


    public Single(String typeOfRoom, String status, int numberOfRooms, double price,  boolean hasFreeWifi,  boolean hasAirConditioner) {
        super(typeOfRoom, status, numberOfRooms);
        this.price = price;
        this.hasFreeWifi = hasFreeWifi;
        this.hasAirConditioner = hasAirConditioner;
    }

}
