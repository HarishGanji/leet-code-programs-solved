package com.leetcode.practice.streams;

//Find the first non-repeating character in a string using Streams.
//Input: "teeter"
//Output: 'r'
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String a = "teeter";

		List<Character> nonRepeat = a.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(nonRepeat.get(0));
	}
}