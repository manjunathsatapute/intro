package com.xworkz.corejava.privateaccessmodifier;

public class Dog {	//public and default
	
	//instance variables
	private String breed;
	protected String color;
	int age;	//default modifier
	public boolean isMale;
	
	//constructors
	private Dog() {
		System.out.println("Creating object of dog");
	}
	Dog(String inBreed){
		System.out.println("Creating object of dog using one parameter constr");
	}
	public Dog(String inBreed, int inAge) {
		System.out.println("Creating object of dog using parameters");
	}
	
	private void eating() {
		System.out.println("Dog is eating");
	}
	void barking() {
		breed = "Julie";
		System.out.println("Dog is barking");
	}
	public void running() {
		System.out.println("Dog is running");
	}
	
	public static void main(String[] args) {
		Dog inhousedog = new Dog();
		inhousedog.breed = "Julie";
		inhousedog.age = 3;
		
		inhousedog.eating();
		inhousedog.barking();
	}

}
