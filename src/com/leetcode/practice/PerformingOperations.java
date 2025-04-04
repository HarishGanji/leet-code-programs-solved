package com.leetcode.practice;

public class PerformingOperations {
	
	public int finalValueAfterOperations(String[] operations) {
		int result = 0;
		for (int i = 0; i < operations.length; i++) {
			String ch = operations[i];
			if (ch.equals("++X") || ch.equals("X++")) {
				result++;
			} else {
				result--;
			}
		}

		return result;
	}

	public static void main(String args[]) {
		PerformingOperations po = new PerformingOperations();
		String[] strings = {"++X","++X","X++"};
		int result = po.finalValueAfterOperations(strings);
		System.out.println(result);
	}
}