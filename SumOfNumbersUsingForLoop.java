import java.util.Scanner;

public class SumOfNumbersUsingForLoop {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println("Enter the number");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int res = 0;
		for (int i = 1; i <= a; i++) {
			res += i;
			// System.out.println("Sum of numbers = "+res);
		}
		System.out.println("Sum of numbers upto "+a+" = "+ res);
		System.out.println("Main Method Ended");
	}

}
