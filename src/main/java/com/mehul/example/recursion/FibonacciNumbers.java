package com.mehul.example.recursion;

public class FibonacciNumbers {

	public static int findFibonacci(int n, int a, int b) {
		if (n == 1)
			return b;

		return findFibonacci(n - 1, b, a + b);

	}

	public static void main(String[] args) {
		System.out.println(findFibonacci(4, 0, 1));
	}
}
