package com.mehul.example.recursion;

public class SumOfDigitsUsingNormalRecursion {
	public static int sumOfDigitsUsingTailRecursion(int digit) {
		if (digit == 0)
			return 0;

		return digit % 10 + sumOfDigitsUsingTailRecursion(digit / 10);
	}

	public static void main(String[] args) {
		System.out.println("Total of 5555 is " + sumOfDigitsUsingTailRecursion(5555));
	}
}
