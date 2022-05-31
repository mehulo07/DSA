package com.mehul.example.arrays;

import java.util.Arrays;

public class MoveAllZerosToTheEnd2 {

	// Time Complexity O(n)
	public static void moveAllZerosToTheEnd(int[] arr) {
		int temp;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 5, 0, 8, 0, 9, 0, 0 };
		moveAllZerosToTheEnd(arr);
		System.out.println("Result : " + Arrays.toString(arr));
	}
}
