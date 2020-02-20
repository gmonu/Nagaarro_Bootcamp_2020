package Patterns;

import java.util.Scanner;

public class Odd_then_even_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = n; i>=1; i--)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}	
			System.out.println();
		}
		for(int i =1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}		
			System.out.println();
		}
	}

}
