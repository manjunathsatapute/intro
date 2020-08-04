import java.util.Scanner;

public class RainbowColorUsingSwitch {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println("Enter the color");

		Scanner sc = new Scanner(System.in);
		String color = sc.next();
		sc.close();

		switch (color) {

		case "Violet":
			System.out.println("The color entered is a rainbow color");
			break;
		case "Indigo":
			System.out.println("The color entered is a rainbow color");
			break;
		case "Blue":
			System.out.println("The color entered is a rainbow color");
			break;
		case "Green":
			System.out.println("The color entered is a rainbow color");
			break;
		case "Yellow":
			System.out.println("The color entered is a rainbow color");
			break;
		case "Orange":
			System.out.println("The color entered is a rainbow color");
			break;
		case "Red":
			System.out.println("The color entered is a rainbow color");
			break;

		default:
			System.out.println("It is not a rainbow color");
			break;
		}
		System.out.println("Main Method Ended");
	}

}
