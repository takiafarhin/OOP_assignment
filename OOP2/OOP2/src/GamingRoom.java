public class GamingRoom implements BillGenerator{
    Customer customer;
    double Hours;
    double PricePerHour;


    public GamingRoom(Customer customer, double Hours, double PricePerHour) {
        this.customer = customer;
        this.Hours = Hours;
        this.PricePerHour = PricePerHour;
    }

    public double generateBill(){
       if(customer.isVIP ){
           return PricePerHour*Hours*0.5;
       }
       else if(Hours>5)
         {
              return PricePerHour*Hours*0.75;
         }
       else{
           return PricePerHour*Hours;
       }
    }
}
