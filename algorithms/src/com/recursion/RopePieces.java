package com.recursion;

/*Given a rope of length n and three values (a,b,c) we need to make maximum no. of pieces 
such that every piece has length in set {a,b,c}*/

public class RopePieces {

	public static void main(String[] args) {
		//System.out.println(getMax(23, 9, 11, 12));
		System.out.println(getMax(5, 1, 2, 3));

	}

	public static int getMax(int n, int a, int b, int c) {
		if (n < 0)
			return -1;
		if (n == 0)
			return 0;
		int ca = getMax(n - a, a, b, c);
		int cb = getMax(n - b, a, b, c);
		int cc = getMax(n - c, a, b, c);
		int res = max(ca, cb, cc);
		if (res == -1)
			return -1;
		else
			return res + 1;
	}

	private static int max(int ca, int cb, int cc) {
		return (ca > cb && ca > cc) ? ca : (cb > ca && cb > cc) ? cb : cc;
	}
}
