package Patterns;

import java.util.Scanner;

public class Count_set_bits {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		int input;
		for(int i = 1; i<=testcases; i++)
		{
			input = in.nextInt();
			System.out.print(checkbits(input));
		}
		
		
		
		
	}
	static int checkbits(int n)
	{
		int count =0;
		while(n>0)
		{
			count = count + n&1;
			n = n>>1;
		}
		return count;
	}

}
