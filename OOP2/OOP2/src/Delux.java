public class Delux extends Room{
    double price;
    boolean hasBalcony=true;
    boolean hasFreeWifi=true;
    boolean hasFreeBreakfast=true;
    boolean hasAirConditioner=true;


    public Delux(String typeOfRoom, String status, int numberOfRooms, double price, boolean hasBalcony, boolean hasFreeWifi, boolean hasFreeBreakfast, boolean hasAirConditioner) {
        super(typeOfRoom, status, numberOfRooms);
        this.price = price;
        this.hasBalcony = hasBalcony;
        this.hasFreeWifi = hasFreeWifi;
        this.hasFreeBreakfast = hasFreeBreakfast;
        this.hasAirConditioner = hasAirConditioner;
    }


}
