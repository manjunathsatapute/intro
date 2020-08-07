
public class School {

	String name;
	int noOfStudents;
	double area;
	String principal;

	public School() {
		System.out.println("No-arg constructor");
	}

	public School(String inName) {
		name = inName;
	}

	public School(String inName, int inNoOfStudents) {
		name = inName;
		noOfStudents = inNoOfStudents;
	}

	public School(String inName, int inNoOfStudents, double inArea, String inPrincipal) {
		name = inName;
		noOfStudents = inNoOfStudents;
		principal = inPrincipal;
		area = inArea;
	}

	void hasHoliday() {
		System.out.println("School has holidays");
	}

	void running(boolean isRunning) {
		System.out.println("Is School running: " + isRunning);
	}

	public static void main(String[] args) {

		System.out.println("start prog");

		School Shantiniketan = new School();
		System.out.println("name : " + Shantiniketan.name + " noofstudents : " + Shantiniketan.noOfStudents
				+ " principal : " + Shantiniketan.principal + " area :" + Shantiniketan.area);

		School Nirmal = new School("Nirmal", 100, 2000, "Mr. Manoj");
		System.out.println("name : " + Nirmal.name + " noofstudents : " + Nirmal.noOfStudents + " principal : "
				+ Nirmal.principal + " area : " + Nirmal.area);

		School Navodaya = new School("Navodaya");
		System.out.println("name : " + Navodaya.name + " noofstudents : " + Navodaya.noOfStudents + " principal : "
				+ Navodaya.principal + " area : " + Navodaya.area);

		System.out.println("end prog");
	}
}
