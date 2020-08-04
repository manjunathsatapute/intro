
public class DisplayValues {

	
	DisplayValues(){
		System.out.println("no-arg constructor");
	}
	
	void display(String strValues) {
		System.out.println("The received string values is "+strValues);
	}
	
	void display(String strValues, char charValues) {
		System.out.println("The received string values is "+strValues);
		System.out.println("The received char values is "+charValues);
	}
	
	void display(char charValues, int intValues) {
		System.out.println("The received int values is "+intValues);
		System.out.println("The received string values is "+charValues);
	}
	
//	String display(String strValues) {	
//	same signature but different return type not allowed so its not method overloading
//	}
	
	public static void main(String[] args) {

		DisplayValues disp = new DisplayValues();
		//compile time polymorphism
		disp.display("Hello world");
		System.out.println("============");
		disp.display("hello", 'k');
		System.out.println("============");
		disp.display('h', 2);
	}

}
