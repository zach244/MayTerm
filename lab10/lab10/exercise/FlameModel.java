import java.util.ArrayList;

public class FlameModel implements Model{
    ArrayList<ViewObserver> observers = new ArrayList<ViewObserver>();
    
    String newString = null;

    public void process(String input){
        newString = input.toUpperCase();
        notifyViews();
    }

 public void registerView(ViewObserver v){
    observers.add(v);
 }
  public void notifyViews(){
    for (int i = 0; i < observers.size(); i++) {
        ViewObserver observer = (ViewObserver) observers.get(i);
        observer.updateView(newString);
      }
  }
  public void removeView(ViewObserver v){
    int i = observers.indexOf(v);
    if (i >= 0) {
      observers.remove(i);
  }
}
}