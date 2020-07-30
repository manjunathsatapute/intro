import java.util.Scanner;

public class ToFindSmallestLargestInTwoDimArray {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row size");
		int row = scan.nextInt();
		System.out.println("Enter the column size");
		int column = scan.nextInt();

		int array[][] = new int[row][column];
		System.out.println("Enter the array elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		scan.close();
		System.out.println("The Array elements are");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		int biggest = array[0][0];
		int smallest = array[0][0];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (biggest < array[i][j])
					biggest = array[i][j];
				if (smallest > array[i][j])
					smallest = array[i][j];
			}
		}
		System.out.println();
		System.out.println("Smallest array element is " + smallest);
		System.out.println();
		System.out.println("Biggest array element is " + biggest);

		System.out.println("Main Method Ended");
	}
}
