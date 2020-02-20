package Patterns;

import java.util.Scanner;

public class HourGlass_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr;
		arr = new int[n];
		for(int i = 0; i>arr.length; i++)
		{
			for(int j = i; j>arr.length; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
			
	}

}
