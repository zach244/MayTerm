import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PigLatinModel implements Model{
    ArrayList<ViewObserver> observers = new ArrayList<ViewObserver>();
    
    String newString = null;

    public void process(String input){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int start = 0; // start index of word
    int firstVowel = 0;
    int end = input.length(); // end index of word
    for(int i = 0; i < end; i++) { // loop over length of word
        char c = Character.toLowerCase(input.charAt(i)); // char of word at i, lower cased
        if(Arrays.asList(vowels).contains(c)) { 
            firstVowel = i;
            break; // stop looping
        }
    }
    if(start != firstVowel) { // if start is not equal to firstVowel, we caught a vowel.
        String startString = input.substring(firstVowel, end);
        String endString = input.substring(start, firstVowel) + "ay";
        newString = startString+endString;
    }
    else {
        newString = input; 
    }
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