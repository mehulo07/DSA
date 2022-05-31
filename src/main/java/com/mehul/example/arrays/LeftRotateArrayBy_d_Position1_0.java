package com.mehul.example.arrays;

public class LeftRotateArrayBy_d_Position1_0 {

	public static void leftRotateArrayBy_d_Position(int[] arr, int d) {

		int[] tempArr = new int[d];

		for (int i = d; i < arr.length; i++) {
			if (i - d < d) {
				tempArr[i - d] = arr[i - d];
			}
			arr[i - d] = arr[i];
		}
		for (int i = 0; i < tempArr.length; i++) {
			arr[arr.length - d] = tempArr[i];
			d--;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		leftRotateArrayBy_d_Position(arr, 2);
	}
}
