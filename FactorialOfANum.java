import java.util.Scanner;

public class FactorialOfANum {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int fact=1;
		int i=1;
		
//		for(int i=1; i<=n; i++) {
//			fact*=i;	
//			System.out.println("Factorial of "+n+" = "+fact);
//		}
		
		
//		do {
//			fact *= i;
//			i++;
//		}while(i<=n);
//		System.out.println("Factorial of "+n+" = "+fact);
		
		
		while(i<=n) {
			fact *=i;
			i++;
		}
		System.out.println("Factorial of "+n+" = "+fact);
		
		System.out.println("Main Method Ended");
	}

}
