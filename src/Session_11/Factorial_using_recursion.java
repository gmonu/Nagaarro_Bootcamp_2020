package Session_11;

import java.util.Scanner;

public class Factorial_using_recursion {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(fact(n));
		
	}
	
	public static long fact(long n)
	{
		if(n == 0)
		{
			return 1; 
		}
		
		
		//int a =1;
		long a = n * fact(n-1);
		return a;
	}

}
