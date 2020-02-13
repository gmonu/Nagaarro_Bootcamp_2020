package Session_5;
import java.util.*;
public class Prime_number_print {
	
	public static int check_prime(int n)
	{
		
		int flag = 0;
		
		
		for(int k=2; k<=n/2; k++)
		{
			if(n%k==0)
			{
					flag = 1;
					break;
			}		
		}
		if(flag == 1)
		{
			System.out.println(n);
		}
		
		return 0;
	
	}
	
	public static void main(String args[])
	{
		
	int i;	
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	
	for(i=2; i<=n; i++)
	{
			
		check_prime(i);
					
	}
		in.close();
	}
}