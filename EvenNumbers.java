
public class EvenNumbers {

	public static void main(String[] args) {
	
		System.out.println("Main Method Started");
		
		System.out.println("Even numbers between 15 to 30");
		
		for(int i=15; i<=30; i++) {
			if(i%2==0) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		System.out.println("Main Method Ended");	
	}

}
