
public class EatBreakfast {
	public static void main(String[] args) {
		EggDish scrambled = new ScrambledEggs();
		scrambled.prepareEggs(3);
		
		EggDish omelette = new Omelette();
		omelette.prepareEggs(2);
		
		EggDish sunny = new SunnySide();
		sunny.prepareEggs(1);
	}

}
