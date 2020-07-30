import java.util.Scanner;

public class ToFindTotalMarksAndPercentage {

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the Maximum Marks to calculate the percentage");
		double maxMarks = sc.nextInt();

		int[] array = new int[n];
		
		System.out.println("Enter the array elements using for-loop");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("The array elements are");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		int securedMarks = 0; double percentage = 0;
		for (int i = 0; i < array.length; i++) {
			securedMarks += array[i];
		}
		
		percentage = ((securedMarks * 100) / maxMarks);
		System.out.println("Total marks = " + securedMarks);
		System.out.println("Total percentage = " + percentage);
		
		System.out.println("Main Method Ended");
	}
}