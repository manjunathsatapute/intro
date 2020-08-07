
public class Bike {

	String brand;
	int cubicCapacity;
	double mileage;
	String color;
	double price;

	void startBike() {
		System.out.println("Start the Bike using Kick/Button");
	}

	void accelerateTheBike() {
		System.out.println("Don't accelerate the bike beyond the limit");
	}

	void applyTheBrakes() {
		System.out.println("Apply the brakes at speed bumps");
	}

	void stopBike() {
		System.out.println("Stop the Bike");
	}

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println();
		System.out.println("The details of the 2 bikes are as follows");
		System.out.println("******First Bike********");

		Bike firstbike = new Bike(); // first instance created

		firstbike.brand = "Royal Enfield";
		firstbike.cubicCapacity = 350;
		firstbike.mileage = 36;
		firstbike.color = "Red";
		firstbike.price = 1.80;

		System.out.println("Brand: " + firstbike.brand);
		System.out.println("Cubic Capacity: " + firstbike.cubicCapacity);
		System.out.println("Mileage: " + firstbike.mileage);
		System.out.println("Color: " + firstbike.color);
		System.out.println("Price: " + firstbike.price);

		System.out.println();

		firstbike.startBike();
		firstbike.accelerateTheBike();
		firstbike.applyTheBrakes();
		firstbike.stopBike();

		System.out.println();
		System.out.println("******Second Bike********");
		Bike secondbike = new Bike(); // second instance created

		secondbike.brand = "Honda CB Hornet";
		secondbike.cubicCapacity = 160;
		secondbike.mileage = 50;
		secondbike.color = "Green";
		secondbike.price = 1;

		System.out.println("Brand: " + secondbike.brand);
		System.out.println("Cubic Capacity: " + secondbike.cubicCapacity);
		System.out.println("Mileage: " + secondbike.mileage);
		System.out.println("Color: " + secondbike.color);
		System.out.println("Price: " + secondbike.price);

		System.out.println();

		secondbike.startBike();
		secondbike.accelerateTheBike();
		secondbike.applyTheBrakes();
		secondbike.stopBike();

		System.out.println();
		System.out.println("Main Method Ended");
	}
}