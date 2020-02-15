package Session_8;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		int[] n;
		n = new int[a];
		for(int i = 0; i<n.length; i++)
		{
			n[i]=in.nextInt();
		}
	
		bubble(n);
		for(int i =0; i<n.length; i++)
		{
			System.out.println(n[i]);
		}
	}
	public static void bubble(int[] a)
	{
		for(int i = 1; i<a.length; i++)
		{
			for(int j = 0; j<a.length-i; j++)
			{
				if(a[j]>a[j+1])
				{
					swap(a, j, j+1);
				
				}
			}	
		}
	}
	
	public static void swap(int[] a,int x, int y)
	{
		int temp = a[x];
		a[x]=a[y];
		a[y]=temp;
		
	}

}
