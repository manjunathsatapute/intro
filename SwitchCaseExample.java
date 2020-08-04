import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {

		System.out.println("start prog");
		System.out.println("Enter the grades to know marks");
		Scanner sc = new Scanner(System.in);

		char character = sc.next().charAt(0);
		sc.close();

		switch (character) {

		case 'A':
			System.out.println("The char is vowel");
			break;
		case 'E':
			System.out.println("The char is vowel");
			break;
		case 'I':
			System.out.println("The char is vowel");
			break;

		case 'O':
			System.out.println("The char is vowel");
			break;

		case 'U':
			System.out.println("The char is vowel");
			break;

		default:
			System.out.println("The char is not vowel");
			break;
		}

		System.out.println("End prog");
	}

}
