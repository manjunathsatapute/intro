import java.util.Scanner;

public class UserDefinedTwoDimensionalArray {

	public static void main(String[] args) {

		System.out.println("Main Method Started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row size");
		int row = sc.nextInt();
		System.out.println("Enter the Column size");
		int column = sc.nextInt();

		int array[][] = new int[row][column];
		System.out.println("Enter the array elements using for loop");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		sc.close();

		System.out.println("The two dimensional array elements are");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The Transpose of a matrix is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("Main Method Ended");
	}
}