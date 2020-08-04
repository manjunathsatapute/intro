import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println("Enter the Number");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		int cube = 0;
		for (int i = 1; i <= a; i++) {
			cube = i * i * i;
			System.out.println("Cube of number " +i+ " = " + cube);
		}
		System.out.println("Main Method Ended");
	}

}
