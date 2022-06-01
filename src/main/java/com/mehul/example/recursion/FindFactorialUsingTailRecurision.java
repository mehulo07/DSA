package com.mehul.example.recursion;

public class FindFactorialUsingTailRecurision {

	public static int factorial(int n, int k) {
		if (n == 0 || n == 1)
			return k;

		return factorial(n - 1, k * n);
	}

	public static void main(String[] args) {
		System.out.println(factorial(5, 1));
	}

}
