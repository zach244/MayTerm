
public class Omelette extends EggDish{
	
	
	public void prepare() {
		System.out.println("Stirring the eggs");
	}
	
	public void cook() {
		System.out.println("Flipping the omelette while cooking");
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
