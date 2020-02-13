package session_7;

import java.util.Scanner;

public class ABCDEEDCBA_Pattern {
	
	public static void main()
	{
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int row = 1;
		 int cols = n;
		 
		 while(row<=n)
		 {
			 int col = 1;
			 while(col<=cols)
			 {
				 System.out.println((char)(64+col));
				 col++;
			 }
			 col--;
			 while(col!=0)
			 {
				System.out.println((char)(col-1));
			 }
		 }
	}

}
