package com.xworkz.encapsulation;

public class Bank {

	private String accNum;
	private double balance;

	public Bank(String inputAccNo) {
		accNum = inputAccNo;
	}

	public void displayBalance(String acctNo) {
		System.out.println("The balance for account number " + acctNo + " is : " + balance);
	}

	public void deposit(int amount) {
		if (amount > 0)
			balance += amount;
		else
			System.out.println("You have entered incorrect amount");
	}

	void withdraw() {
		System.out.println("Amount withdrawn is " + balance);
	}

	/*
	 * public String getAccNum() { return accNum; }
	 * 
	 * public void setAccNum(String accNum) { this.accNum = accNum; }
	 */
}
