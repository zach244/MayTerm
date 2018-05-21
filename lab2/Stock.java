import java.util.ArrayList;


public class Stock implements Subject{
    private String name;
    private ArrayList<Observer> observers;
   private Transaction latestTransaction;

    public Stock(String name){
        observers = new ArrayList<Observer>();
        this.name = name;
    }
    public void addObserver(Observer o){
        observers.add(o);
    }
    /* remove a registered observer */
    public void removeObserver(Observer o) {
    observers.remove(0);
   }
  
   /* notify all registered observers */
   public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
     Observer obs = observers.get(i);
    obs.update(latestTransaction);
    
    }
}
    /* bidders invoke this method when they submit a bid */ 
 public void submitTransaction(Transaction transaction) {
    this.latestTransaction = transaction;
  
    // notify all registered bidders (observers)
    notifyObservers();  
   }
   
   public String getName(){
       return name;
   }
}