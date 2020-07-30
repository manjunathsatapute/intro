
public class DoubleArray {

	public static void main(String[] args) {

		System.out.println("MMS");

		double[] dArr = new double[5];
		dArr[0] = 20.00;
		dArr[1] = 48.00;
		dArr[2] = 23.00;
		// dArr[3] = 56.00;
		dArr[4] = 98.00;
		// dArr[5] = 20.00; //AIOBE

		int leng = dArr.length;
		for (int i = 0; i < leng; i++) {
			System.out.println(dArr[i]);
		}

		System.out.println("The values of dArr using for-each-loop");
		for (double tempStr : dArr) {
			System.out.println(tempStr);
		}
		System.out.println("MME");
	}
}
