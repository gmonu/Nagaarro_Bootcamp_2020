package Patterns;

import java.util.Scanner;

public class Number_with_Stars_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k;
		for(int i =1; i<=n; i++)
		{
			for(k =1; k<=i; k++)
			{
			System.out.print(k);
			}
			for(int j =0; j<=n-k; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
