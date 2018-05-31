import java.io.BufferedReader;
import java.io.IOException;

public class ScrambledEggs extends EggDish{
	Boolean choice = false;
	
	public void prepare() {
		System.out.println("Stirring and adding milk to the eggs");
	}
	
	public void cook() {
		System.out.println("Scrambling the eggs.");
	}
	
	public boolean customerWantsSaltPepper(){
		String answer = getUserInput();

		if(answer.toLowerCase().startsWith("y")){
			return true;
		}
		else{
			return false;
		}
	}
	
}
