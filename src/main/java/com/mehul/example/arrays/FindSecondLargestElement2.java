package com.mehul.example.arrays;

public class FindSecondLargestElement2 {

	// Time complexity O(n)
	public static int getSecondLargetElemet(int arr[]) {
		int previousLargest = -1;
		int curruntLargest = 0;

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] > arr[curruntLargest]) {
				previousLargest = curruntLargest;
				curruntLargest = j;
			} else if (arr[curruntLargest] != arr[j]) {
				if (previousLargest == -1 || arr[previousLargest] < arr[j]) {
					previousLargest = j;
				}
			}
		}
		return previousLargest;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 44, 88, 55, 77, 89, 1, 6, 4, 90, 7, 8, 9, 5, 2, 1, 44, 4, 55, 100, 99 };
//		int[] arr = new int[] { 10, 10, 10, 10, 10 };
//		int[] arr = new int[] { 12, 8, 12, 7, 9 };
		int result = getSecondLargetElemet(arr);
		if (result < 0) {
			System.out.println("No such element presnet in the array");
		} else {
			System.out.println("second largest Element is :" + arr[result]);
		}
	}
}