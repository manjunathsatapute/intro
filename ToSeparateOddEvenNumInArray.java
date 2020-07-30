import java.util.Scanner;

public class ToSeparateOddEvenNumInArray {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println("Enter the array size");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n];

		System.out.println("Enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		System.out.println("The user defined array elements are");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				count++;
		}

		int evenarray[] = new int[count];
		int oddarray[] = new int[array.length - count];

		int x = 0, y = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenarray[x] = array[i];
				x++;
			} else {
				oddarray[y] = array[i];
				y++;
			}
		}
		System.out.println();

		System.out.println("The even set of array elements are");
		for (int j = 0; j < evenarray.length; j++) {
			System.out.print(evenarray[j] + " ");
		}
		System.out.println("\n");

		System.out.println("The odd set of array elements are");
		for (int j = 0; j < oddarray.length; j++) {
			System.out.print(oddarray[j] + " ");
		}
		System.out.println();
		System.out.println("Main Method Ended");
	}
}
