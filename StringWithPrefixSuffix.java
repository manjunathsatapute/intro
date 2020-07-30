
public class StringWithPrefixSuffix {

	public static void main(String[] args) {

		System.out.println("Main Method Started");

		String fruitArray[] = new String[3];
		fruitArray[0] = "Apple";
		fruitArray[1] = "Mango";
		fruitArray[2] = "Grapes";

		System.out.println("The values of Array using for-loop");
		for (int i = 0; i < fruitArray.length; i++) {
			// if (fruitArray[i] != null) {
			System.out.println("===" + fruitArray[i] + "***");
		}
		// }
		System.out.println("The values of Array using for-each-loop");
		for (String tempStr : fruitArray) {
			System.out.println("===" + tempStr + "***");
		}
		System.out.println("Main Method Ended");
	}
}