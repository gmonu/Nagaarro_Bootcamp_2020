package Session_5;
import java.util.*;
public class Binary_to_decimal {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    for(int i = 0; i < n; i++)
	    {
	    	int setinput = in.nextInt();
	    	System.out.println(Decimal(setinput));
	    }
	     
	     
	   
	in.close();
	}
	
	static int Decimal(int n)
	{
		 int power=1;
	     int dec = 0;
	        while(n!=0)
	        {
	            int rem = n%10;
	            dec = dec + rem * power;
	            power = power*2;
	            n = n/10;
	        }
	   return dec;
	}
}
