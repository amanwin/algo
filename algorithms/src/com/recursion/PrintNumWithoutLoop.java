package com.recursion;

public class PrintNumWithoutLoop {

	public static void main(String[] args) {
		getNumber(5);
	}
	
	public static void getNumber(int num) {
		if(num == 0)
			return;
		System.out.println(num);
		getNumber(num - 1);
	}

}
