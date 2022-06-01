package com.mehul.example.recursion;

public class DecimalToBinary {

	public static void function(int n) {
		if (n == 0)
			return;
		function(n / 2);
		System.out.print(n % 2);
	}

	public static void main(String[] args) {
		function(13);
	}
}
