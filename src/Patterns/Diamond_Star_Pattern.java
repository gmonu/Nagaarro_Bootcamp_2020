package Patterns;

import java.util.Scanner;

public class Diamond_Star_Pattern {

	public static void main(String args[])
	{
			int n, i, j, space = 1;
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			n = a/2+1;
			space = n - 1;
			for (j = 1; j<= n; j++)
				{
					for (i = 1; i<= space; i++)
						{
							System.out.print(" \t");
						}
					space--;
					
					for (i = 1; i <= 2 * j - 1; i++)
						{
							System.out.print("*\t");
						}
					System.out.println();
				}
			space = 1;
			for (j = 1; j<= n - 1; j++)
				{
					for (i = 1; i<= space; i++)
						{
							System.out.print(" \t");
						}
					space++;
					for (i = 1; i<= 2 * (n - j) - 1; i++)
						{
							System.out.print("*\t");
						}
					System.out.println();
				}
}
}