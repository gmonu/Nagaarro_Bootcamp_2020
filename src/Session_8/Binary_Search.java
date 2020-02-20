package Session_8;

import java.util.Scanner;

public class Binary_Search {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr;
		arr = new int[n];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]=in.nextInt();
		}
		int m = in.nextInt();
		System.out.println(Binary(arr, m));
	}
	
	static int Binary(int[] n, int data)
	{
		int left = 0;
		int right = n.length-1;
		
		while(left<=right)
		{
			int mid = (left+right)/2; 
			if(n[mid]==data)
				return mid;
			
			else if(n[mid]>data)
				right = mid - 1;
			
			else 
				left = mid + 1;
	
		}
		return -1;
	}

}
