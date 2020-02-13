package Session_5;
import java.util.*;

class Fibonacci_series{
static long fib(long n)
	{
	 long t0=0, t1=1;
     long s=0;
	 for(long i =1; s<=n; i++)
	{
		
			s = t0+s;
			t0=t1;
			t1=s;	
		
		
			if(s < n)
			{	System.out.println(s);
			}
		
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