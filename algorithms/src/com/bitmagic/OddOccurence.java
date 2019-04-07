package com.bitmagic;

/*Given an array that contains all elements even no. of times except one element. 
Find the odd occuring element.*/

public class OddOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getOddOccurence());
	}

	private static int getOddOccurence() {
		int res = 0;
		int[] a = new int[] { 3, 5 };
		for (int i = 0; i < a.length; i++) {
			res = res ^ a[i];
		}
		return res;
	}

}
