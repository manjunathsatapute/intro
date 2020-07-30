
public class TwoDimensionalArray {

	public static void main(String[] args) {

		System.out.println("Main Method Started");

		int intArray[][];
		intArray = new int[2][2];
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[1][0] = 3;
		intArray[1][1] = 4;

		System.out.println("Two dimensional Array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				// System.out.print("["+i+"] ["+j+"] : ");
				System.out.print(intArray[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("Using Literals :");
		int[][] literalIntArray = { { 10, 20 }, { 30, 40 } }; // new intArray[2][2]

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("[" + i + "] [" + j + "] : ");
				System.out.println(literalIntArray[i][j] + "  ");
			}
			// System.out.println();
		}

		System.out.println("==== 3 * 3 ===="); // new intArray[3][3]
		int[][] threeArray = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// System.out.print("["+i+"] ["+j+"] : ");
				System.out.print(threeArray[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
