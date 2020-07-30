
public class CharArray {

	public static void main(String[] args) {

		System.out.println("MMS");
		
		char charArr[] = {'A', 'E', 'I', 'O', 'U'};
		
		System.out.println("length of literal string: " + charArr.length);
		//System.out.println("Address of charArr = "+charArr); // address of literalStrArray
		System.out.println();

		//for each loop
		System.out.println("The values of StrArray using for-each-loop");
		for (char tempStr : charArr) {
			System.out.println(tempStr);
		}
		System.out.println("MME");
	}

}
