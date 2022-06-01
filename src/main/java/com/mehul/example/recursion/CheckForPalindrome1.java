package com.mehul.example.recursion;

public class CheckForPalindrome1 {

	static StringBuilder newString = new StringBuilder();

	// Tail recursion
	public static boolean isPalindrom(String string, int strLength) {
		if (strLength == 0)
			return newString.toString().equals(string);

		newString.append(string.charAt(strLength - 1));
		return isPalindrom(string, strLength - 1);
	}

	public static void main(String[] args) {
		String name = "abbcbba";
//		String name = "mehul";
//		String name = "eye";
		boolean isPalindrom = isPalindrom(name, name.length());
		System.out.println("Is " + name + " palindrome : " + isPalindrom);
	}

}
