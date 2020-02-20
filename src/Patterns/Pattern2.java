package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
	 for(int i =1; i <= n; i++)
	 {
		 if(i%2 != 0)
		 {
			 for(int j = 0; j<i; j++)
			 {
				 System.out.print("1");
			 }
			 System.out.println();
		 }
		 
		 if(i%2==0){
				System.out.print("1"); 
					for(int j = 2; j<i; j++)
						{		
							System.out.print("0");
						}
//					while(i>0)
//					{
//						System.out.print("0");
//						i--;
//					}
				System.out.print("1");
				System.out.println();
	 	}
		 
	 }

	}

}
