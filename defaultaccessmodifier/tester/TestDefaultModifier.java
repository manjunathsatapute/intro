package com.xworkz.corejava.defaultaccessmodifier.tester;

import com.xworkz.corejava.privateaccessmodifier.Dog;	//fully qualified class name

public class TestDefaultModifier {

	public static void main(String[] args) {

		//cannot access default or protected members of Dog outside the class and in different package
		//but can access public members
		Dog dog = new Dog("Labarodar", 0);	//new Dog("Lab");
		
		//dog.age = 2;	//default modifier
		dog.isMale = false;
		
		//dog.barking();	//default modifier
	}

}
