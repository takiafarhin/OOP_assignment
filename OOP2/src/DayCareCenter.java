public class DayCareCenter implements BillGenerator {
    String typeOfRoom;
    double price;
    int numberOfChildren;
    double Hours;

    public DayCareCenter(String typeOfRoom, double price, int numberOfChildren, double Hours) {
        this.typeOfRoom = typeOfRoom;
        this.price = price;
        this.numberOfChildren = numberOfChildren;
        this.Hours = Hours;
    }

    public double generateBill() {
        if (typeOfRoom.equals("Deluxe")) {
            return price * numberOfChildren * Hours;
        }
        else{
            if(numberOfChildren>2){
                return price*numberOfChildren*Hours*0.75;
            }
            else{
                return price*numberOfChildren*Hours;
            }
        }

    }

}
