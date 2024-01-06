public class LandaryOrder implements BillGenerator{
    Customer customer;
    Landary landary;
    int quantity;

    double price;

    public LandaryOrder(Customer customer, int quantity,  double price, Landary landary) {
        this.customer = customer;
        this.quantity = quantity;
        this.price = price;
        this.landary = landary;
    }

    public double generateBill(){

       return price*quantity;

    }
}
