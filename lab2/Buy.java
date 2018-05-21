public class Buy{

    private String buyer;
    private double amount;
    
    public Buy(String buyer, double amount){
        this.buyer = buyer;
        this.amount = amount;
    }
    public String toString(){
        return "Seller: " + buyer + " $" + amount;
    }
}