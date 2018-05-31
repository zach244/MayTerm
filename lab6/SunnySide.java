
public class SunnySide   extends EggDish{
	
	
	public void prepare() {
		System.out.println("Never stir sunny side up!");
	}
	
	public void cook() {
		System.out.println("Cooking the eggs sunny side up.");
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
