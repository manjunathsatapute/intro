import java.util.Scanner;

public class InputFromUser {
	public static void main(String[] args) {
		System.out.println("Enter an string");

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		System.out.println("The word you entered is " + input);
	}
}
