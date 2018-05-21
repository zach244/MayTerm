public class Sell{
    private String seller;
    private double amount;
    public Sell(String seller, double amount){
        this.seller = seller;
        this.amount = amount;
    }
    public String toString()
    {
        return "Seller: " + seller + " $" + amount;
    }
}