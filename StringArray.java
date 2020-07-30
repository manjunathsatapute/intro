
public class StringArray {

	public static void main(String[] args) {

		System.out.println("MMS");

		String StrArray[] = new String[5];
		StrArray[0] = "Car";
		StrArray[1] = "Bike";
		StrArray[2] = "Truck";

		System.out.println("The values of StrArray using for-loop");
		int leng = StrArray.length;
		for (int i = 0; i < leng; i++) {
			System.out.println(StrArray[i]);
		}

		System.out.println("The values of StrArray using literals");
		String[] literalStrArray = { "summer", "winter", "rainy", "spring" };

		System.out.println("length of literal string: " + literalStrArray.length);
		System.out.println(literalStrArray); // address of literalStrArray
		System.out.println();

		//for each loop
		System.out.println("The values of StrArray using for-each-loop");
		for (String tempStr : literalStrArray) {
			System.out.println(tempStr);
		}
		System.out.println("MME");
	}
}