public class ArithmeticOprnUsingMethods {

	public void additionOperation(int a, int b) {
		int sum = a + b;
		System.out.println("The addition of " + a + " & " + b + " is : " + sum);
	}

	public int subtractionOperation(int c, int d) {
		int sub = c - d;
		System.out.println("The subtraction of " + c + " & " + d + " is : " + sub);
		return sub;
	}

	public long multiplicationOperation(long e, int f) {
		long mult = e * f;
		System.out.println("The multiplication of " + e + " & " + f + " is : " + mult);
		return mult;
	}

	public double divisionOperation(int g, double h) {
		double div = g / h;
		System.out.println("The division of " + g + " & " + h + " is : " + div);
		return div;
	}

	public double modulusOperation(double i, int j) {
		double mod = i % j;
		return mod;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		ArithmeticOprnUsingMethods operation = new ArithmeticOprnUsingMethods();
		
		operation.additionOperation(10, 20);
		operation.subtractionOperation(40, 50);
		operation.multiplicationOperation(123, 987);
		operation.divisionOperation(98, 9.50);

		int j = 23;
		double i = 120;
		double res = operation.modulusOperation(120, 23);
		System.out.println("The modulus of " + i + " & " + j + " is : " + res);

		System.out.println("Main Method Ended");
	}
}