package com.mehul.example.recursion;

public class PrintN_numbersInNacturalOrder {

	public static void function(int n) {
		if (n == 0)
			return;
		function(n - 1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		function(10);
	}
}
