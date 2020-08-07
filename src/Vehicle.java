
public class Vehicle {

	String regNo;
	int noOfWheels;
	String fuelType;

	public Vehicle() {
		System.out.println("No-arg constructor");
	}

	public Vehicle(String inRegNo, int inNoOfWheels, String inFuelType) {
		regNo = inRegNo;
		noOfWheels = inNoOfWheels;
		fuelType = inFuelType;
	}

	public Vehicle(String inRegNo) {
		regNo = inRegNo;
	}

	public Vehicle(String inRegNo, int inNoOfWheels) {
		regNo = inRegNo;
		noOfWheels = inNoOfWheels;
	}

	void running() {
		System.out.println("vehicle is running");
	}

	void applyBrakes(boolean brakes) {
		System.out.println("Applying brakes " + brakes);
	}

	public static void main(String[] args) {

		System.out.println("start prog");

		Vehicle car = new Vehicle();
		System.out.println("regno " + car.regNo + " noofwheels " + car.noOfWheels + " fueltype " + car.fuelType);

		Vehicle bike = new Vehicle("KA38jh0987", 2, "petrol");
		System.out.println("regno "+bike.regNo+" noofwheels "+bike.noOfWheels+" fueltype "+bike.fuelType);
	
		Vehicle truck = new Vehicle("KA47jh0987");
		System.out.println("regno "+truck.regNo+" noofwheels "+truck.noOfWheels+" fueltype "+truck.fuelType);
	
		System.out.println("end prog");
	}

}
