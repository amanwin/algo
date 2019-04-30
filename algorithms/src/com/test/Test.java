package com.test;

public class Test {

	public static void main(String[] args) {
		f(173);
		System.out.println(Math.sqrt(3));

	}
	//https://www.geeksforgeeks.org/gate-gate-cs-2015-set-3-question-49/
	
	//https://www.geeksforgeeks.org/c-language-set-7/ question 2
	//https://www.geeksforgeeks.org/gate-gate-cs-2014-set-2-question-50/
	//https://gateoverflow.in/2008/gate2014-2-42
	public static int fun (int n)
	{
	  int x=1;
	  if (n==1) return x;
	  for (int k=1; k<n; ++k)
	     x = x + fun(k) * fun(n - k);
	  return x;
	}
	
//	unsigned int foo(unsigned int n, unsigned int r) {
//		  if (n  > 0) return (n%r +  foo (n/r, r ));
//		  else return 0;
//		}
	
	public static void f (int n)
	{ 
	if (n <=1) {
		System.out.print(n);
	}
	else {
	f (n/2);
	System.out.print(n%2);
	}
	}
	
	public static void count(int n)
	{
	    int d = 1;
	    System.out.println(n);
	    System.out.println(d);
//	    printf("%d ", n);
//	    printf("%d ", d);
	    d++;
	    if(n > 1) count(n-1);
	    System.out.println(d);
//	    printf("%d ", d);
	}
//	int main()
//	{
//	    count(3);
//	}

}
