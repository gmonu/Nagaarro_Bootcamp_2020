package Patterns;

import java.util.Scanner;

public class Fibonacci_Pattern {
		static long fib(long n)
		{
			 long t0=0, t1=1;
		     long s=0;
			 for(long i =1; i<=n; i++)
			{
				
				 for(int j =0; j<i; j++)
				 {
					   	s = t0+s;
					   	t0=t1;
					   	t1=s;	
						System.out.print(s+" ");
				 }
				 System.out.println();
				 
				
			}			
			return 0;
	}
			
			public static void main(String args[]) {
		        Scanner in = new Scanner(System.in);
		        long n = in.nextLong();
		        fib(n);
		        in.close();
		    }

		}
	