
public class Bottle {

	// instance variables // states
	String color;
	String material;
	int litres;

	Bottle() { // constructors
		System.out.println("creating bottle object");
	}

	void pouringWater() {
		System.out.println("Pour water");
	}

	void openingCap() {
		System.out.println("Open the cap to pour water");
	}

	void closingCap() {
		System.out.println("close the cap");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		Bottle prestigeBottle = new Bottle(); // instance/object creation
		prestigeBottle.color = "grey";
		prestigeBottle.material = "steel";
		prestigeBottle.litres = 1;
		
		System.out.println();
		
		System.out.println("color: " + prestigeBottle.color);
		System.out.println("material: " + prestigeBottle.material);
		System.out.println("litres: " + prestigeBottle.litres);
		
		System.out.println();
		
		prestigeBottle.pouringWater();
		prestigeBottle.openingCap();
		prestigeBottle.closingCap();
		
		System.out.println();
		
		Bottle tupperwareBottle = new Bottle();
		tupperwareBottle.color = "orange";
		tupperwareBottle.material = "copper";
		tupperwareBottle.litres = 2;

		System.out.println("main Method Ended");

	}
}
