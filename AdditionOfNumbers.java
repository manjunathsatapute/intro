
public class AdditionOfNumbers {

	int a, b, c;
	
	AdditionOfNumbers(){
		System.out.println("no-arg constructor");
	}
	
	public AdditionOfNumbers(int inputa, int inputb, int inputc) {
		a = inputa;
		b = inputb;
		c = inputc;
	}
	
	void sum(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of two numbers "+sum);
	}
	
	void sum(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("Sum of 3 numbers "+sum);
	}
	
	void sum(int a, double b) {
		double sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {

		AdditionOfNumbers add = new AdditionOfNumbers(10, 20, 30);
		add.sum(add.a , add.b);
		add.sum(10, 20);
		add.sum(10, 20, 30);
		
	}
}
