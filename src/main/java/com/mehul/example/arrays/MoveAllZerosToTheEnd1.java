package com.mehul.example.arrays;

import java.util.Arrays;

public class MoveAllZerosToTheEnd1 {

	// Time Complexity : O(n^2)
	public static void moveAllZerosToTheEnd(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != 0) {
						arr[i] = arr[j];
						arr[j] = 0;
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 5, 0, 8, 0, 9, 0, 0 };
		moveAllZerosToTheEnd(arr);
		System.out.println("Result : " + Arrays.toString(arr));
	}
}
