package com.xworkz.staticmembers;

public class StudentTester {

	public static void main(String[] args) {

		System.out.println("Students in the college: "+Student.college);
		Student.initCollege();
		
		Student krupa = new Student("Krupa", 1);
		krupa.display();
		
		Student shrikar = new Student("Shrikar", 1);
		shrikar.display();
		
		Student jagannath = new Student("Jagannath", 1);
		jagannath.display();
		
		Student mary = new Student("mary", 1);
		mary.display();
	}

}
