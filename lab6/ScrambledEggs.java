
public class ScrambledEggs extends EggDish{
	
	
	public void prepare() {
		System.out.println("Stirring and adding milk to the eggs");
	}
	
	public void cook() {
		System.out.println("Scrambling the eggs.");
	}
	
	boolean saltAndPepperHook(boolean choice){
		boolean saltPepper = false;
		if(choice == true){
			saltPepper = true;
		}
		return saltPepper;
	}

}
