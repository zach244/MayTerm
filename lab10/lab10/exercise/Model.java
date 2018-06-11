public interface Model {
  // processes the input based upon the strategy of the implementation of the model.
  public void process(String input);
  
  // following methods are related to registering observers
  public void registerView(ViewObserver v);
  public void notifyViews();
  public void removeView(ViewObserver v);
}