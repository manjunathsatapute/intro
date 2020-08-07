package com.xworkz.encapsulation;

//A Java class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods. 

public class Sanitizer {

	private String name;
	private int quantity;
	private double price;
	private boolean containsAlcohol;

	public void setName(String inputName) {
		name = inputName;
	}

	public String getName() {
		System.out.println("The name of sanitizer is: "+name);
		return name;
	}

	void setQuantity(int inputQuantity) {
		quantity = inputQuantity;
	}

	int getQuantity() {
		System.out.println("The quantity of sanitizer is: "+quantity+"ml");
		return quantity;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	private double getPrice() {
		return price;
	}

	public void setContainsAlcohol(boolean containsAlcoholOrNot) {
		containsAlcohol = containsAlcoholOrNot;
	}

	public boolean getContainsAlcohol() {
		System.out.println("The sanitizer contains alcohol: "+containsAlcohol);
		return containsAlcohol;
	}
}
