package Session_11;

import java.util.Scanner;

public class Fibonacci_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =0; i<=n; i++)
			System.out.println(fib(i));
		

	}
	public static int fib(int n)
	{
		//int result =
//		int f= 0;
		if(n ==0 || n==1)
		{
			return n;
		}
		int fn = fib(n-1);
		int fm = fib(n-2);
	
		int r = fn + fm;
		return r;
	}

}
