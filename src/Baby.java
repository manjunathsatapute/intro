
public class Baby {

	String name;
	double age;		//age in years
	String gender;
	String color;
	
	void givingFood() {
		System.out.println("Mom tries to feed the "+name);
	}
	
	void takingBath() {
		System.out.println("Mom cleanse the "+name+" daily");
	}
	
	void tryingToTalk() {
		System.out.println("Mom helps "+name+" to talk");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		System.out.println();
		System.out.println("The details of Babies are as follows");
		
		Baby Abhi = new Baby();		//first instance created
		Abhi.name = "Abhinav";
		Abhi.age = 2.5;
		Abhi.gender = "Male";
		Abhi.color = "White";
		
		System.out.println("Name: "+Abhi.name);
		System.out.println("Age: "+Abhi.age);
		System.out.println("Gender: "+Abhi.gender);
		System.out.println("Color: "+Abhi.color);
				
		System.out.println();
		
		Abhi.givingFood();
		Abhi.takingBath();
		Abhi.tryingToTalk();
		
		Baby laxmi = new Baby();		//second instance created
		laxmi.name = "Laxmi";
		laxmi.age = 2;
		laxmi.gender = "Female";
		laxmi.color = "Red";
		
		System.out.println();
		
		System.out.println("Name: "+laxmi.name);
		System.out.println("Age: "+laxmi.age);
		System.out.println("Gender: "+laxmi.gender);
		System.out.println("Color: "+laxmi.color);
				
		System.out.println();
		
		laxmi.givingFood();
		laxmi.takingBath();
		laxmi.tryingToTalk();
		
		System.out.println();
		System.out.println("Main Method Ended");
	}
	
}
