package com.xworkz.staticmembers;

public class Student {

	String name;
	int studentId;
	static String college;	//global variable
	
	static {
		//initialization
	}
	public Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	static void initCollege() {
		college = "Xworkz";
	}
	
	void display() {
		System.out.println("Student id: "+studentId);
		System.out.println("Student name: "+name);
		System.out.println("Student college: "+college);
	
	}
	
	/*
	 * public static void main(String[] args) { 
	 * StudentTester.main(args); 
	 * }
	 */
}
