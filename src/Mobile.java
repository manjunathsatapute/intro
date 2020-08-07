
public class Mobile {

	String brand;
	boolean isSmartPhone;
	int ram;
	double price;

	Mobile() { // default/no-argument constructor
		System.out.println("calling constructor");
		brand = "Samsung";
		isSmartPhone = true;
		ram = 4;
		price = 16000.00;
		System.out.println("ending constructor");
	}

	void makeCall(long phoneNum) {
		System.out.println("Making call to : " + phoneNum);
	}

	void charging(boolean isCharging) {
		System.out.println("Is the charging on: " + isCharging);
	}

	void locked(boolean isLocked) {
		System.out.println("Is the phone locked: " + isLocked);
	}

	public static void main(String[] args) {

		System.out.println("start prog");
		Mobile nokia = new Mobile(); // default constructor
		System.out.println("brand: " + nokia.brand + " isSmartphone: " + nokia.isSmartPhone + " price : " + nokia.price
				+ " ram: " + nokia.ram);

		nokia.brand = "nokia";
		nokia.isSmartPhone = false;
		System.out.println("brand: " + nokia.brand + " isSmartphone: " + nokia.isSmartPhone + " price : " + nokia.price
				+ " ram: " + nokia.ram);

		System.out.println("end prog");
	}
}
