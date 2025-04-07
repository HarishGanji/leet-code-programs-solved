package com.leetcode.practice;

public class MaxStringPairs {

	public String reverse(String word) {
		String reverse = "";
		for (int k = word.length() - 1; k >= 0; k--) {
			reverse += String.valueOf(word.charAt(k));
		}
		return reverse;
	}

	public int maximumNumberOfStringPairs(String[] words) {
		int length = words.length;
		int counter = 0;
		for (int i = 0; i < length; i++) {
			if (words[i].equals("0")) {
				continue;
			}
			String rev = reverse(words[i]);
			for (int j = i + 1; j < length; j++) {
				if (rev.equals(words[j])) {
					words[j] = "0";
					counter++;
					break;
				}
			}
		}
		return counter;
	}

	public static void main(String args[]) {
		MaxStringPairs max = new MaxStringPairs();
		String[] words = { "cd", "ac", "dc", "ca", "zz" };
		int result = max.maximumNumberOfStringPairs(words);
		System.out.println(result);
	}
}