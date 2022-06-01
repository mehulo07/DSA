package com.mehul.example.recursion;

public class Practice1 {

	static void function(int n) {
		if (n == 0)
			return;

		function(n - 1);
		System.out.println(n);
		function(n - 1);
	}

	public static void main(String[] args) {
		function(3);
	}

}
