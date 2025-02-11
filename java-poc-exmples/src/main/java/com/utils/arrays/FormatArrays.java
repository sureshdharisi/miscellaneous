package com.utils.arrays;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class FormatArrays {

	public static void main(String[] args) {
		int[] input = { 17, 18, 2, 4, 6, 1 };
		printArray(input);
		printArray(convertArray(input));
	}

	private static int[] convertArray(int[] array) {
		int[] result = new int[array.length];

		Stack<Integer> stack = new Stack<>();

		for (int i = array.length - 1; i >= 0; i--) {

			if (stack.isEmpty()) {
				result[i] = -1;
			} else if (stack.peek() > array[i]) {
				result[i] = stack.peek();
			} else {
				result[i] = stack.pop();		
			}
			if (stack.isEmpty()) {
				stack.push(array[i]);
			}

		}

		return result;
	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.stream(array).mapToObj(val -> String.valueOf(val)).collect(Collectors.joining(",")));
	}
}
