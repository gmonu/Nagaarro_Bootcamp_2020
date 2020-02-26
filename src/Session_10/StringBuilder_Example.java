package Session_10;

import java.util.Scanner;

public class StringBuilder_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		String n[];
		n = new String[t];
		String s;
		for(int i =0; i<t; i++)
		{
			n[i] = in.nextLine();
		}
		
		for(int i =0; i<t; i++)
		{
			if(n[i].chatAt(0) > n[i+1].charAt(0))
		}
		
//		if(a>b)
//		{
//			System.out.print(Integer.toString(a)+Integer.toString(b));
//		}
//		else
//		{
//
//			System.out.print(Integer.toString(b)+Integer.toString(a));
//			
//		}
	}

}
