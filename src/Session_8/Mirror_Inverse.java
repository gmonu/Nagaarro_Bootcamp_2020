package Session_8;

import java.util.Scanner;

public class Mirror_Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int data;
		for(int i =0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =0; i<n; i++)
		{
			b[i] = sc.nextInt();
		}
		for(int i =0; i<n; i++)
		{
			data = a[i];
			c[data] = i;			
		}
		
		if(c.equals(b))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
		
	}

}
