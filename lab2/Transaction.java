
 enum Type{ Buy,Sell
 }
public class Transaction{
  
    private Trader trader;
    private double amount;
    private Type typeOfTransaction;
    private Stock stock;

    public Transaction(Stock stock,Trader trader, double amount,Type type){
       this.stock = stock;
        this.trader = trader;
        this.amount = amount;
        this.typeOfTransaction = type;
    }

    public String toString(){
        return "Stock Name: " + stock.getName() + " Transaction Type: " + typeOfTransaction.toString() + " Trader: " + trader.toString() + " Amount: $" + amount;
    }
}