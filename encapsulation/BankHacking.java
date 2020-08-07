package com.xworkz.encapsulation;

public class BankHacking {

	public static void main(String[] args) {

		Bank bank = new Bank("31223223134");	//obj created for Bank class
		
//		bank.accNum = "31223223134";
//		bank.balance = 10000.00;
		
//		bank.displayBalance(bank.accNum);
		
		bank.displayBalance("31223223134");
		bank.deposit(-10000);
		bank.withdraw();
		
	}

}
