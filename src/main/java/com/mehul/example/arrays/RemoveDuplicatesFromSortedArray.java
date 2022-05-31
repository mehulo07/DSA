package com.mehul.example.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public static int removeDuplicatesFromGivenSortedArray(int arr[]) {
		int newSize = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[newSize - 1]) {
				arr[newSize] = arr[i];
				newSize++;
			}
		}

		for (int j = newSize; j < arr.length; j++) {
			arr[j] = 0;
		}
		return newSize;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 10, 20, 20, 20, 30, 30, 30, 30, 30 };
		System.out.println("Old size Of array is : " + arr.length + ", new Size of array "
				+ removeDuplicatesFromGivenSortedArray(arr));
		System.out.println("refined array : " + Arrays.toString(arr));
	}
}
