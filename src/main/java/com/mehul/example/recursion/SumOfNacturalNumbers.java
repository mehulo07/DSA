package com.mehul.example.recursion;

public class SumOfNacturalNumbers {

	public static int sumOfN_NacturalNumbers(int n) {
		if (n == 0)
			return 0;

		return n + sumOfN_NacturalNumbers(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(sumOfN_NacturalNumbers(5));
	}
}
