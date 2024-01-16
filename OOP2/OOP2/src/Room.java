public  class Room {
    String typeOfRoom;
    String status;
    int numberOfRooms;


    public Room(String typeOfRoom, String status, int numberOfRooms) {
        this.typeOfRoom = typeOfRoom;
        this.status = status;
        this.numberOfRooms = numberOfRooms;
    }

    public void isAvailable(){
        if(numberOfRooms!=0){
            status= "Available";
            numberOfRooms--;
        }
        else{
            status="Not Available";
        }
    }

}
