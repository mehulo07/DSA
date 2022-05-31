package com.mehul.example.arrays;

import java.util.Arrays;

public class LeftRotateArrayByOnePosition {

	public static void leftRotateArrayByOnePosition(int[] arr) {

		int firstElement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = firstElement;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		leftRotateArrayByOnePosition(arr);
		System.out.println(Arrays.toString(arr));
	}
}
