package com.problem;

import java.util.HashSet;
import java.util.Set;

class Program {
	public static int[] twoNumberSum(int[] array, int targetSum) {
		int[] output = new int[2];
		int a, b = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (set.contains(array[i])) {
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
	
	public static void main(String[] args) {
		int array[] = {3,5,-4,8,11,1,-1,6};
		System.out.println(twoNumberSum(array,10));
	}
}
