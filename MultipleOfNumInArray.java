import java.util.Scanner;

public class MultipleOfNumInArray {

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		System.out.println("Enter the Array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Enter the multiplication factor");
		int m = sc.nextInt();

		int Array[] = new int[n];

		System.out.println("Enter the values of Array elements using for-loop");
		int leng = Array.length;
		for (int i = 0; i < leng; i++) {
			Array[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("The array elements are");
		for (int i = 0; i < leng; i++) {
			System.out.println(Array[i]);
		}

		System.out.println("The array after multiplication factor");
		for (int i = 0; i < leng; i++) {
			System.out.println(m * Array[i]);
		}
		System.out.println("Main Method Ended");
	}
}