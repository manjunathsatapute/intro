
public class ArrayExample {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println();

		int myArray[];
		myArray = new int[10]; // size

		myArray[0] = 3; // assigning
		myArray[1] = 6;
		myArray[6] = 10;
		myArray[8] = 48;
		myArray[9] = 15;

		System.out.println("The value of index 0 is " + myArray[0]);
		System.out.println("The value of index 7 is " + myArray[7]);
		// System.out.println("The value of index 10 is " + myArray[10]); //ERROR: AIOBE

		int mySecondArray[] = { myArray[0], 3, 4, 5, 7 }; // it is called literals and we can use one array value inside another array;
		System.out.println("The value in index 0 of mySecondArray is " + mySecondArray[0]);

		System.out.println();
		System.out.println("Array using for-loop");
		System.out.println();

		for (int i = 0; i < myArray.length; i++) {
			// another way to write condition: i<=myArray.length-1; Both are same
			System.out.println("The value indexes is: " + myArray[i]);
		}
		System.out.println();
		System.out.println("Main Method Ended");
	}
}
