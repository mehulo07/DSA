package com.mehul.example.arrays;

public class SearchingOnArray2 {

	// This program complexity is O(n) (BigO of N )
	public static int getLargestElement(int[] arr) {
		int index = 0;
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			if (arr[i] > arr[index]) {
				index = i;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 12, 4, 6, 2, 8, 113, 4, 78, 1, 88, 33, 74 };
		int largestElementIndex = getLargestElement(arr);
		System.out.println("Largest element is : " + arr[largestElementIndex]);

	}
}
