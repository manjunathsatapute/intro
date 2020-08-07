package com.xworkz.memorymanagement;

public class SumAndAvgCalcn {

	void sumAndAvg(int a, int b) {

		int sumOfNumbers = sum(a, b);
		double avgOfNumbers = average(sumOfNumbers, 2);

		System.out.println("Sum of 2 numbers: " + sumOfNumbers);
		System.out.println("Average of 2 numbers: " + avgOfNumbers);

	}

	private int sum(int d, int e) {
		int sum = d + e;
		return sum;
	}

	private double average(int total, int dividend) {
		double avg = total / dividend;
		return avg;
	}
}
