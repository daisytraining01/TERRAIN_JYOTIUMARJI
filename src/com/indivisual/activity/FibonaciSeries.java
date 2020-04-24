package com.indivisual.activity;

public class FibonaciSeries {

	public static void printFibonacciSeries(int count) {
		int num1 = 0, num2 = 1;
		System.out.print("Fibonacci Series of " + count + " numbers:");

		int i = 1;
		while (i <= count) {
			System.out.print(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			i++;
		}

	}

	public static void main(String args[])

	{
		printFibonacciSeries(10);

	}

}
