package com.dp;

import java.util.Arrays;

/*
 * Problem Statement
 * We have k number of eggs and a building with n floors. What is the least number of egg-droppings that 
 * is guaranteed to find the highest floor from which the egg won't break on dropping?
 * f(N,E) = min ( max (f(N-x, e) , f(x-1, e-1) + 1)) 
 * Base condition F[1][E] = 1 => means 1 floor and E eggs, so min try will be 1
 *                F[N][1] = N 
 */
public class EggDropping {

	public static void main(String[] args) {
		System.out.println(new EggDropping().solveUsingDp(8, 4));
	}

	public int solveUsingDp(int n, int k) {
        final int results[][] = new int[n + 1][k + 1];
        for (int i = 0; i < n + 1; i++) {
            results[i][1] = i;
        }
        for (int i = 0; i < k + 1; i++) {
            results[1][i] = 1;
        }
        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < k + 1; j++) {
                results[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x < i; x++) {
                    final int brokenEggResult = results[x - 1][j - 1];
                    final int EggSurvivedResult = results[i - x][j];
                    int temp = Math.max(brokenEggResult, EggSurvivedResult) + 1;
                    if (temp < results[i][j]) {
                        results[i][j] = temp;
                    }
                }
            }
        }
        for (final int[] a : results) {
            System.out.println(Arrays.toString(a));
        }
        return results[n][k];
    }

}
