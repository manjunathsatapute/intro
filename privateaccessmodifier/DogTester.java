package com.xworkz.corejava.privateaccessmodifier;

public class DogTester {

	public static void main(String[] args) {
		
		//cannot access private member of dog class outside the class
		//can access default members outside the class
		Dog outsidedog = new Dog("German Shepherd", 5);	//new Dog();
		//outsidedog.breed = "German Shepherd";
		
		outsidedog.age =5;	//default member of Dog
		outsidedog.color ="brown";	//Protected member of Dog
		outsidedog.isMale = true;	//public member of Dog
		
		//System.out.println("Dog breed value: "+outsidedog.breed);
		System.out.println("Dog age: "+outsidedog.age);
		
		//dog1.eating();
		outsidedog.barking();
	}
}
