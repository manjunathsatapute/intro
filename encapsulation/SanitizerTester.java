package com.xworkz.encapsulation;

public class SanitizerTester {

	public static void main(String[] args) {

		Sanitizer patanjali = new Sanitizer();
		
		//write only class
		patanjali.setName("Patanjali");		
		patanjali.setQuantity(500);
		patanjali.setContainsAlcohol(true);
//		patanjali.setPrice(100.00);
		
		//read only class
		patanjali.getName();			
		patanjali.getQuantity();
		patanjali.getContainsAlcohol();
//		patanjali.getPrice();
		
		/*
		 * System.out.println("The name of sanitizer is: "+patanjali.getName());
		 * System.out.println("The quantity of sanitizer is: "+patanjali.getQuantity()+"ml"); 
		 * System.out.println("The sanitizer contains alcohol: "+patanjali.getContainsAlcohol());
		 */
		
	}

}
