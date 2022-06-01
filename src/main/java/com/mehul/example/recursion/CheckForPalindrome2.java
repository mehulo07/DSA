package com.mehul.example.recursion;

public class CheckForPalindrome2 {

	public static boolean isPalindrom(String string, int start, int end) {

		if (start >= end)
			return true;
		return (string.charAt(start) == string.charAt(end) && isPalindrom(string, start + 1, end - 1));
	}

	public static void main(String[] args) {
//		String string = "mehul";
		String string = "ababababababababa";
		boolean isPalindrom = isPalindrom(string, 0, string.length() - 1);
		System.out.println("Is " + string + " palindrome : " + isPalindrom);

	}
}
