package com.xworkz.encapsulation;

public class FacebookAccount {

	private String password;
	private String userName;

	public void setUserName(String inputUserName) {
		userName = inputUserName; // writing the value
	}

	public String getUserName() {
		System.out.println("The username is: " + userName); // reading the value
		return userName;
	}

	void setPassword(String inputPassword) {
		password = inputPassword;
	}

	private void getPassword() {
		System.out.println("The password is: " + password); // used internally in explicit cases like forgot password
	}

	/*
	 * public static void main(String[] args) { // FacebookAccount account = new
	 * FacebookAccount();
	 * 
	 * account.password = "xyz"; // account.userName = "pqr";
	 * 
	 * account.setUserName("xyz"); //account.getUserName();
	 * 
	 * account.setPassword("pqr"); //account.getPassword(); }
	 */

}
