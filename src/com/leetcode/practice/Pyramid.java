package com.leetcode.practice;

public class Pyramid {
	public static void main(String[] args) {
		int row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row - i - 1; j++) {
				System.out.print("  ");
			}

			for (int j = i + 1; j > 0; j--) {
				if (j == 1) {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < row - 1 - i; k++) {
				if (k == 3 - i) {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
