
public class SimpleStraightPatternOfNum {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println("Simple numbers pattern");
		
		for (int i=1; i<=4; i++) {
			System.out.println();
			for(int j=4-i; j<=3; j++) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
		
		System.out.println("Main Method Ended");
	}

}
