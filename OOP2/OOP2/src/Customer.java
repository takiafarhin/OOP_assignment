public class Customer {
    String name;
    String address;
    String phoneNumber;
    String email;
    String creditCardNumber;
    String checkInDate;
    String checkOutDate;
    String typeOfRoom;
    int numberOfRooms;
    boolean isVIP;



    public Customer(String name, String address, String phoneNumber, String email, String creditCardNumber, String checkInDate, String checkOutDate, String typeOfRoom, int numberOfRooms) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.creditCardNumber = creditCardNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.typeOfRoom = typeOfRoom;
        this.numberOfRooms = numberOfRooms;
    }

    public void isVIP(){
        if(typeOfRoom=="Deluxe"){
           isVIP=true;
        }
        else{
            isVIP=false;
        }
    }
}
