package com.mehul.example.recursion;

public class RodCutting {

	public static int getMaxRodCut(int n, int a, int b, int c) {

		if (n == 0)
			return 0;

		if (n <= -1)
			return -1;

		int max = Math.max(Math.max(getMaxRodCut(n - a, a, b, c), getMaxRodCut(n - b, a, b, c)),
				getMaxRodCut(n - c, a, b, c));

		if (max == -1)
			return max;

		return max + 1;

	}

	public static void main(String[] args) {
		int n = 5, a = 2, b = 1, c = 5;

		System.out.println(getMaxRodCut(n, a, b, c));
	}

}
