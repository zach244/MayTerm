/**
 * Modify this version so you invoke addTea() in an executor.
 *
 */

public class MakeTeaInParallel {
	public static void main(String[] args) {
		TeaCup blueCup = new TeaCup();
		Water water = new Water();
		final TeaInfuser infuser = new TeaInfuser();
		final Tea tea = new Tea("Earl Grey");
				
		infuser.addTea(tea);
		
		water.boilWater();
		
		blueCup.addWater(water);
		
		blueCup.setSteepTime(15);
		
		blueCup.steep();
	}

}

