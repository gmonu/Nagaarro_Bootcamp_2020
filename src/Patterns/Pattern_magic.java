package Patterns;

import java.util.Scanner;

public class Pattern_magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int px = n;
		int py = n;
		
		upper(n, px, py);
		lower(n, px, py);
		
		
		

	}
	
	static void upper(int n, int px, int py)
	{
		for(int k = 1; k<=2*n-1; k++)
		{
			System.out.print("*");
		}
		System.out.println();

		for(int i =1; i<n-1; i++)
		{
			for(int j =1; j<=(n*2)-1; j++)
			{
				
				if(j>=py && j<=px)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print("*");
				}

			}
			px++;
			py--;
			System.out.println();
		}
		
	}
	
	static void lower(int n, int px, int py)
	{

		for(int i =1; i<=n; i++)
		{
			for(int j =1; j<=n*2-1; j++)
			{
				if(j<=i || j>(n*2-1)-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
//			px--;
//			py++;
			System.out.println();
		}
	}

}
