//com-->company/org-->organization, facebook-->name of company, instagram-->project name
package com.facebook.instagram.search;

//import to get visibility of the class from different package
import com.facebook.instagram.login.LoginValidation;	//to import single class LoginValidation
import com.facebook.instagram.login.*;	//to import all the classes in that package

public class SearchTester {
	
	public static void main(String[] args) {
		
		//use fully qualified class name when class names are same but in different packages.
		com.facebook.instagram.login.User user = new com.facebook.instagram.login.User();
		
		com.facebook.instagram.stories.User user2 = new com.facebook.instagram.stories.User();
		
		//LoginValidation log = new LoginValidation();
	}

}
