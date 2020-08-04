
public class SimpleInvertedStarPattern {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		System.out.println("Simple inverted star pattern");
		
		for (int i=1; i<=6; i++) {
			System.out.println();
			for(int j=i-1; j<=5; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.println("Main Method Ended");
	}

}
