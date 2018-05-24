/**
 * Put the kettle on and we'll all have tea.
 */

public class MakeTea {
	public static void main(String[] args) {
		Water water = new Water();
		TeaInfuser infuser = new TeaInfuser();
		TeaCup blueCup = new TeaCup();
		TeaFacade teaMaker = new TeaFacade(blueCup,water,infuser);

		teaMaker.makeTea("Earl Grey");
	}

}
