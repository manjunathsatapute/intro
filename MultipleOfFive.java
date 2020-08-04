import java.util.Scanner;

public class MultipleOfFive {

	public static void main(String[] args) {

		System.out.println("Enter the number for multiplication table");

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		sc.close();

		System.out.println("The multiples of");

		for (int i = 1; i <= 10; i++) {
			int mul = i * input;
			System.out.println(input + " * " + i + " = " + mul);

		}

	}

}
