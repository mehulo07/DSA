package com.mehul.example.arrays;

public class SearchingOnArray1 {

	// This program complexity is O(n)^2 (BigO of N square)
	public static int getLargestElement(int[] arr) {
		int index = 0;
		int arrayLength = arr.length;
		boolean largestFound;
		for (int i = 0; i < arrayLength; i++) {
			largestFound = true;
			for (int j = 0; j < arrayLength; j++) {
				if (arr[j] > arr[i]) {
					largestFound = false;
				}
			}
			if (largestFound) {
				return i;
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
