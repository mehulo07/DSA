package com.mehul.example.arrays;

public class IsArraySorted {

	// This function will take Order of N time to find weather array is sorted or
	// not O(n)
	public static boolean isArraySorted(int[] arr) {
		boolean isSorted = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}

		return isSorted;
	}

	public static void main(String[] args) {
//		System.out.println("isArray Soted : " + isArraySorted(new int[] { 8, 10, 10, 12 }));
		System.out.println("isArray Soted : " + isArraySorted(new int[] { 100, 200, 200 }));
	}

}
