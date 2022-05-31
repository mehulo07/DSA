package com.mehul.example.arrays;

import java.util.Arrays;

public class LeftRotateArrayBy_d_Position2 {

	/*
	 * Time Complexity
	 * 
	 * Theta(d) + Theta(n-d) + Theta(n) Theta(2n) Theta(n)
	 * 
	 * Space Complexity Theta(1)
	 */

	public static void leftRotateArrayBy_d_Position(int[] arr, int d) {
		reverse(arr, 0, d - 1);
		System.out.println(Arrays.toString(arr));
		reverse(arr, d, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		reverse(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverse(int arr[], int low, int high) {
		while (low < high) {
			arr[high] = arr[high] + arr[low];
			arr[low] = arr[high] - arr[low];
			arr[high] = arr[high] - arr[low];
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		leftRotateArrayBy_d_Position(arr, 2);
	}
}
