package com.mehul.example.arrays;

import java.util.Arrays;

public class ReverseAnArray {

	// Time Complexity O(n)
	// Space Complexity O(1)
	public static int[] reverseAnArray(int arr[]) {
		int lastIdx = arr.length - 1, tempVar, low = 0;
		while (low < lastIdx) {
			tempVar = arr[low];
			arr[low] = arr[lastIdx];
			arr[lastIdx] = tempVar;
			lastIdx--;
			low++;
		}
		return arr;

	}

	public static void main(String[] args) {
//		int arr[] = new int[] { 30, 20, 5 };
//		int arr[] = new int[] { 10, 5, 7, 30 };
		int arr[] = new int[] { 30, 7, 6, 5, 10 };
		int[] reverseArray = reverseAnArray(arr);
		System.out.println(Arrays.toString(reverseArray));
	}
}
