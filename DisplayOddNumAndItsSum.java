import java.util.Scanner;

public class DisplayOddNumAndItsSum {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println("Enter the number upto which the odd number and its sum is required");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int sum = 0, i = 1;

//		for(int i=1; i<=n; i++) {
//			if(i%2 != 0) {
//				sum+=i;
//				System.out.println("The odd numbers are "+i);
//			}
//		}
//		System.out.println("Sum of odd numbers up to given number "+sum);

		do {
			if (i % 2 != 0) {
				sum += i;
				System.out.println("The odd numbers are " + i);
			}
			i++;
		} while (i <= n);
		System.out.println("Sum of odd numbers up to "+n+" = " + sum);
	}
}
