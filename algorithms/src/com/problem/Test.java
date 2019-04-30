package com.problem;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// int array[] = {3,5,-4,8,11,1,-1,6};
		int array[] = { -21, 301, 12, 4, 65, 56, 210, 356, 9, -47 };
		int[] out = twoNumberSum(array, 164);
		if (out != null) {
			for (int i : out)
				System.out.print(i + " ");
		}

	}

	public static int[] twoNumberSum(int[] array, int targetSum) {
		int[] output = {};
		int a, b = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (set.contains(array[i])) {
				output = new int[2];
				b = array[i];
				a = targetSum - b;
				if (a > b) {
					output[0] = b;
					output[1] = a;
				} else {
					output[0] = a;
					output[1] = b;
				}
			} else {
				set.add(targetSum - array[i]);
			}
		}
		return output;
	}

}
