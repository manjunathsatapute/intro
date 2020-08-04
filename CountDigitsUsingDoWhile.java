import java.util.Scanner;

public class CountDigitsUsingDoWhile {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Enter the number");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int count = 0;
		do {
			n = n / 10;
			count++;
		} while (n > 0);
		System.out.println("The number of digits = " + count);
	}

}
