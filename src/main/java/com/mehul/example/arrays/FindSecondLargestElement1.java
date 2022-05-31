package com.mehul.example.arrays;

public class FindSecondLargestElement1 {

	// Time complexity O(n)
	public static int getLargestIndex(int[] arr) {
		int largestElementIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[largestElementIndex]) {
				largestElementIndex = i;
			}
		}
		return largestElementIndex;
	}

	// Time complexity O(n)
	public static int getSecondLargetElemet(int arr[]) {
		int secondLargestElementIndex = -1;
		int largestElementIndex = getLargestIndex(arr);
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != arr[largestElementIndex]) {
				if (secondLargestElementIndex == -1) {
					secondLargestElementIndex = 0;
				} else {
					if (arr[j] > arr[secondLargestElementIndex]) {
						secondLargestElementIndex = j;
					}
				}
			}
		}

		return secondLargestElementIndex;
	}

	public static void main(String[] args) {
//		int[] arr = new int[] { 10, 44, 88, 55, 77, 89, 1, 6, 4, 7, 8, 9, 5, 2, 1, 44, 4, 55, 100 };
		int[] arr = new int[] { 10, 10, 10, 10, 10 };
		int result = getSecondLargetElemet(arr);
		if (result < 0) {
			System.out.println("No such element presnet in the array");
		} else {
			System.out.println("second largest Element is :" + arr[result]);
		}
	}

}
