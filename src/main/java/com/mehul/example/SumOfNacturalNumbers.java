package com.mehul.example;

public class SumOfNacturalNumbers {

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		for (int i = n; i >= 1;) {
			sum = sum + i + (i - 1);
			i = i - 2;
		}
		System.out.println("Sum : " + sum);
	}

}
