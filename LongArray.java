
public class LongArray {

	public static void main(String[] args) {

		System.out.println("Main Method Started");

		long longArr[] = { 12322, 3113, 324131212, 1112122312, 890411271 };

		System.out.println();

		System.out.println("length of literal string: " + longArr.length);
		System.out.println("Address of charArr = " + longArr); // address of literalStrArray
		System.out.println();

		// for each loop
		System.out.println("The values of longArr using for-each-loop");
		for (long templong : longArr) {
			System.out.println(templong);
		}
		System.out.println("Main Method Ended");
	}

}
