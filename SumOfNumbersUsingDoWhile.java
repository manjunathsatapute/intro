import java.util.Scanner;

public class SumOfNumbersUsingDoWhile {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println("Enter the Number");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int sum = 0;
		int i=1;
		do {
			sum += i;
			i++;
		} while (i <= n);

		System.out.println("Sum of Numbers upto "+n+" = " + sum);
		System.out.println("Main Method Ended");
	}

}
