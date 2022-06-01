package com.mehul.example.recursion;

public class SumOfDigitsUsingTailRecursion {

	public static int sumOfDigitsUsingTailRecursion(int digit, int total) {
		if (digit == 0)
			return total;

		return sumOfDigitsUsingTailRecursion(digit / 10, total + digit % 10);
	}

	public static void main(String[] args) {
		System.out.println("Total of 256 is " + sumOfDigitsUsingTailRecursion(256, 0));
	}
}
