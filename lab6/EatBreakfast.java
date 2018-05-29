
public class EatBreakfast {
	public static void main(String[] args) {
		ScrambledEggs scrambled = new ScrambledEggs();
		scrambled.crackingEggs(2);
		scrambled.prepare();
		scrambled.cook();
		scrambled.saltAndPepperHook(true);
		scrambled.serve();
		
		Omelette omelette = new Omelette();
		omelette.crackingEggs(3);
		omelette.prepare();
		omelette.cook();
		omelette.serve();
		
		SunnySide sunny = new SunnySide();
		sunny.crackingEggs(1);
		sunny.prepare();
		sunny.cook();
		sunny.serve();
	}

}
