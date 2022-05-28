package com.mehul.example;

public class SumOfNacturalNumbers {

	// O(1)
	public static int getSomeOf_N_NacturalNumbers(int n) {
		return n * (n + 1) / 2;
	}

	// O(logn)
	public static int getSomeOf_N_NacturalNumbers_(int n) {
		int sum = 0;
		for (int i = n; i >= 1;) {
			sum = sum + i + (i - 1);
			i = i - 2;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 110;
		System.out.println("Sum : " + getSomeOf_N_NacturalNumbers(n));

		System.out.println("Sum : " + getSomeOf_N_NacturalNumbers_(n));
	}

}
