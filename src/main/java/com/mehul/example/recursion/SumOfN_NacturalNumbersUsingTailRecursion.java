package com.mehul.example.recursion;

public class SumOfN_NacturalNumbersUsingTailRecursion {

	public static int sumOfN_NacturalNumbers(int n, int sum) {
		if (n == 0)
			return sum;
		return sumOfN_NacturalNumbers(n - 1, sum + n);
	}

	public static void main(String[] args) {
		System.out.println(sumOfN_NacturalNumbers(5, 0));
	}
}
