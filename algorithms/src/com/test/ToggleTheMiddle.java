package com.test;

import java.util.Scanner;

public class ToggleTheMiddle {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i =0; i<size; i++) {
			int input = sc.nextInt();
			int numOfBits = countBits(input);
			System.out.println("numOfBits : "+numOfBits);
			if(numOfBits % 2 == 0) {
				System.out.println(toggleKthBit(toggleKthBit(input, numOfBits/2),(numOfBits/2)+1));
			}
			else {
				System.out.println(toggleKthBit(input, numOfBits/2));
			}
		}
	}
	static int countBits(int number) 
    {  
          
        // log function in base 2  
        // take only integer part 
        return (int)(Math.log(number) /  
                     Math.log(2) + 1); 
    } 
	static int toggleKthBit(int n, int k) 
    { 
        return (n ^ (1 << (k-1))); 
    } 
}
