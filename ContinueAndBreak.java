
public class ContinueAndBreak {

	public static void main(String[] args) {

		System.out.println("The numbers except 5");
		
		for(int i=1; i<=10; i++) {
			if(i==5 || i==7) {
				continue;	//it will skip the numbers mentioned
			}
			System.out.println(i);
		}
		
System.out.println("The numbers except 5");
		
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;	//it will stop there and comes out of loop
			}
			System.out.println(i);
		}
	}
}
