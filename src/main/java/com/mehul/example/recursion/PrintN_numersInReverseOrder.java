package com.mehul.example.recursion;

public class PrintN_numersInReverseOrder {

	public static void function(int n) {
		if (n == 0)
			return;
		System.out.print(n + ",");
		function(n - 1);
	}

	public static void main(String[] args) {
		function(10);
	}

}
