public class gymToken implements BillGenerator{
    String ServiceName;
    double Hours;
    double Price;

    public gymToken(String ServiceName, double Hours, double Price) {
        this.ServiceName = ServiceName;
        this.Price = Price;
        this.Hours = Hours;
    }

    public double generateBill(){

        return Price*Hours;
    }
}
