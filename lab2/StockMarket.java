
public class StockMarket {
    public static void main(String[] args) {

    Stock apple = new Stock("Apple");
    Stock microsoft = new Stock("Microsoft");

    Trader joe = new Trader("joe",apple);
    Trader amy = new Trader("amy",microsoft);
    microsoft.addObserver(joe);
    apple.addObserver(amy);
    apple.submitTransaction(new Transaction(apple,joe,1500,Type.Buy));
    microsoft.submitTransaction(new Transaction(microsoft, joe, 2000, Type.Sell));
    apple.submitTransaction(new Transaction(apple,amy,39000,Type.Buy));
    microsoft.submitTransaction(new Transaction(microsoft, amy, 50000, Type.Sell));
    


    }
   }