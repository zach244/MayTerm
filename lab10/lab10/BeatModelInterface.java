/**
 * This specifies the the model.
 */

public interface BeatModelInterface {
  
    /**
     * initializes, turns on/off the model.
     */
  void initialize();
  
  void on();
  
  void off();
  
  /**
   * Used for maintaining state (bpm)
   */
  
  void setBPM(int bpm);
  
  int getBPM();
  
  /**
   * Notice the observer pattern in action.
   */
  void registerObserver(BeatObserver o);
  
  void removeObserver(BeatObserver o);
  
  void registerObserver(BPMObserver o);
  
  void removeObserver(BPMObserver o);
}
