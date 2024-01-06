public class PoolToken implements BillGenerator{
    Customer customer;
    double Hours;
    double PricePerHour;


    public PoolToken(Customer customer, double Hours, double PricePerHour) {
        this.customer = customer;
        this.Hours = Hours;
        this.PricePerHour = PricePerHour;
    }

    public double generateBill(){
       if(Hours>5){
           return PricePerHour*Hours*0.9;
       }
       else if(customer.isVIP)
         {
              return PricePerHour*Hours*0.75;
         }
       else{
           return PricePerHour*Hours;
       }
    }
}
