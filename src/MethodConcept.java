
public class MethodConcept {
	
	public static void sumOfTwo(int a, int b) {
		int sum = a+b;
		System.out.println("The sum of "+a+" & "+b+" is : "+sum);
	}
	
	public static int subOfTwo(int a, int b) {	//parameters
		int sub = a-b;
		//System.out.println("The sum of "+a+" & "+b+" is : "+sub);
		return sub;
	}

	public static void main(String[] args) {
		
		int a=10, b=20;
		sumOfTwo(a, b);	//arguments
		
		int c=30, d=40;
		sumOfTwo(c, d);
		
		sumOfTwo(50, 60);
		
		int e=50, f=40;
		int res=subOfTwo(e, f);
		System.out.println("The sum of "+a+" & "+b+" is : "+res);
	}
}
