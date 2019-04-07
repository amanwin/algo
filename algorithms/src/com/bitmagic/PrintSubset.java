package com.bitmagic;

public class PrintSubset {

	public static void main(String[] args) {
		findAllSubset("ABC");
	}

	public static void findAllSubset(String str) {
		char[] ch = str.toCharArray();
		int count = (1 << str.length());

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < str.length(); j++) {
				if ((i & (1 << j)) != 0) {
					System.out.print(ch[j]);
				}
			}
			System.out.println();
		}
	}
}
