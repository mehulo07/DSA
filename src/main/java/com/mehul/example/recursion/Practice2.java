package com.mehul.example.recursion;

public class Practice2 {

	public static int function(int n) {
		if (n == 1)
			return 0;
		else
			return 1 + function(n / 2);
	}

	public static void main(String[] args) {
		System.out.println(function(16));
	}

}
