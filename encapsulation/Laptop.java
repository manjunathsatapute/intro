package com.xworkz.encapsulation;

public class Laptop {

	private String brandName = "Dell";
	private int ram = 6;
	private double price = 40000;
	private boolean isItWorking = true;
	
	public void toCheckWorking() {
		System.out.println("Check whether laptop or not: "+isItWorking);
	}
	
	public void getLaptopDetails() {
		System.out.println("Name of the Brand: "+brandName+"\n"+"RAM: "+ram+"\n"+"Price of Laptop: "+price);
	}
}
