package com.xworkz.corejava.privateaccessmodifier;

public class DogTesterWithInPackage {

	public static void main(String[] args) {

		//can access all the default and protected members of Dog
		//outside the class but inside the same package
		Dog dog = new Dog("Labarodar");
		dog.age=2;
		dog.barking();
		
	}
}
