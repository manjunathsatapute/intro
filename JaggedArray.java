//here rows are fixed but columns are not fixed
public class JaggedArray {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		Integer a1[] = { 1, 2, 3 }; // Array-1
		Integer a2[] = { 1, 2, 3, 4 }; // Array-2
		Integer a3[] = { 1, 2, 3, 4, 5 }; // Array-3

		Integer a[][] = { a1, a2, a3 }; // Jagged Array

		System.out.println("-----Displaying Jagged Array-------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.print("\n");
		}
		System.out.println("Main Method Ended");
	}
}
