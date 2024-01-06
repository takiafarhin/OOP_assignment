public class Double extends Room{
    double price;
    boolean hasBalcony=true;
    boolean hasFreeWifi=true;

    boolean hasAirConditioner=true;


    public Double(String typeOfRoom, String status, int numberOfRooms, double price, boolean hasBalcony, boolean hasFreeWifi,  boolean hasAirConditioner) {
        super(typeOfRoom, status, numberOfRooms);
        this.price = price;
        this.hasBalcony = hasBalcony;
        this.hasFreeWifi = hasFreeWifi;
        this.hasAirConditioner = hasAirConditioner;
    }
}
