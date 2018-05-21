public class Trader implements Observer{
    
    private Subject stockMarket;
    private String name;

    public Trader(String name,Subject stockMarket){
      this.name = name;
     this.stockMarket = stockMarket;
     stockMarket.addObserver(this);    
    }
  //Observer doesn't like having buy and sell being notified
	public void update(Object newState) {
        //issue with having 2 things split from newState;
       
        Transaction transaction = (Transaction)newState;
        display(transaction);
	}
	
	public void display(Transaction transaction) {
		System.out.println("The Latest Stock trade is:  " + transaction);
    }
    public String getName()
    {
      return this.name;
    }
   public String toString()
   {
     return name;
   }
}