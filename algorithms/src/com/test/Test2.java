package com.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i =0; i<size; i++) {
			int input = sc.nextInt();
			System.out.println(nearestSquare(input));
		}
	}

	private static long nearestSquare(long n) {
		long sqrt = (long) Math.sqrt(n);
		if(sqrt*sqrt == n) {
			n = n-1;
			sqrt = (long) Math.sqrt(n);
		}
		else {
			long small = n-1;
			long large = n+1;
			
			double sqrtSmall = Math.sqrt(small);
			double sqrtLarge = Math.sqrt(large);
			if(Math.abs(n-(long) (Math.round(sqrtSmall)*Math.round(sqrtSmall))) < Math.abs(n-(long) (Math.round(sqrtLarge)*Math.round(sqrtLarge)))) {
				return (long) (Math.round(sqrtSmall)*Math.round(sqrtSmall));
			}
			else {
				return (long) (Math.round(sqrtLarge)*Math.round(sqrtLarge));
			}
		}
		return (long) (Math.round(sqrt)*Math.round(sqrt));
		//return 0;
	}
	
	private static long neeearestSquare(long n) {
		long sqrt = (long) Math.sqrt(n);
		if(sqrt*sqrt == n) {
			long small = n-1;
			long large = n+1;
			
			double sqrtSmall = Math.sqrt(small);
			double sqrtLarge = Math.sqrt(large);
			if(n-(long) (Math.round(sqrtSmall)*Math.round(sqrtSmall)) < n-(long) (Math.round(sqrtLarge)*Math.round(sqrtLarge))) {
				return (long) (Math.round(sqrtSmall)*Math.round(sqrtSmall));
			}
			else {
				return (long) (Math.round(sqrtLarge)*Math.round(sqrtLarge));
			}
		}
		return (long) (Math.round(sqrt)*Math.round(sqrt));
		//return 0;
	}
	private static int neearestSquare(int n) {
		int aheadStart = n+1;
		int preStart = n-1;
		int aheadCount = 0;
		int preCount = 0;
		boolean checkAhead = true;
		boolean checkPre = true;
		while(checkAhead) {
			aheadCount++;
			int sqrt = (int) Math.sqrt(aheadStart);
			if((sqrt * sqrt) == aheadStart) {
				checkAhead = false;
			}
			else {
				aheadStart++;
			}
		}
		while(checkPre) {
			preCount++;
			int sqrt = (int) Math.sqrt(preStart);
			if((sqrt * sqrt) == preStart) {
				checkPre = false;
			}
			else {
				preStart--;
			}
		}
		if(preCount == aheadCount) {
			return aheadStart;
		}
		else if(preCount < aheadCount) {
			return preStart;
		}
		else {
			return aheadStart;
		}
	}
}
