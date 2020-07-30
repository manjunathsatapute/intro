package com.xworkz.blocks;

public class Clip {

	String material;
	double price;
	
	//non-static blocks/initialization blocks
	//these are called during object creation just before the constructors are called
	{
		material = "metal";
	}
	
	Clip(String inputMaterial, double inputPrice) {
		System.out.println("Material: "+material+" price: "+price);
		
		material = inputMaterial;
		price = inputPrice;
	}
	
	void putClip() {
		System.out.println("putclip");
	}
	
	//all the blocks are called in sequence they have written

	{
		price = 50.00;
	}
}
