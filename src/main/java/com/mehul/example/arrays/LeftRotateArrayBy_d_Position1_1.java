package com.mehul.example.arrays;

import java.util.Arrays;

public class LeftRotateArrayBy_d_Position1_1 {
	/*
	 * Time Complexity,
	 * 
	 * Theta(d+n-d+d), Theta(d+n), Theta (n) (as d is smaller then n)
	 * 
	 * Space Complexity, Theta(d) (Auxiliary space complexity)
	 */
	public static void leftRotateArrayBy_d_Position(int[] arr, int d) {

		// Space Complexity : Theta(d)
		int[] tempArr = new int[d];

		// Time Complexity : Theta(d)
		for (int i = 0; i < d; i++) {
			tempArr[i] = arr[i];
		}

		// Time Complexity : Theta(n-d)
		for (int j = d; j < arr.length; j++) {
			arr[j - d] = arr[j];
		}

//		Time Complexity : Theta(d)
		for (int k = 0; k < d; k++) {
			arr[arr.length - d + k] = tempArr[k];
		}

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		leftRotateArrayBy_d_Position(arr, 2);
		System.out.println("Result : " + Arrays.toString(arr));
	}
}
