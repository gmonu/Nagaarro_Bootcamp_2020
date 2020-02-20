package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		
		
		for(int i = 1; i<=n; i++)
		{
			if(i==1)
			{
				for(int j =0; j<i; j++)
				{
				System.out.print(i+"\t");
				}
				System.out.println();
			}

			else if(i==2)
			{
				for(int j =0; j<i; j++)
				{
				System.out.print(i+"\t");
				}
				System.out.println();
			}			
			else 
			{
				System.out.print(i+"\t");
				for(int j = 1; j<i-1; j++)
				{
					System.out.print("0\t");
				}
				System.out.println(i);
			}
		}

	}

}
