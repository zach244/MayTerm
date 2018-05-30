
public class ScrambledEggs extends EggDish{
	Boolean choice = false;
	
	public void prepare() {
		System.out.println("Stirring and adding milk to the eggs");
	}
	
	public void cook() {
		System.out.println("Scrambling the eggs.");
	}
	
	boolean saltAndPepperHook(){
		
		return saltPepper;
	}

}
