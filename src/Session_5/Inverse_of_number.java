package Session_5;

import java.util.Scanner;

public class Inverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n = c+1;
		int[] arr;
		arr = new int[n];
		int[] brr = new int[n];
		for(int i =1; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i =1; i<n; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int i =1; i<n; i++)
		{
			if(arr[i] == i)
			{
				brr[i] = i;
			}
			if (arr[i]!=i)
			{
				//brr[i] = arr[i];
				int d;
				d = arr[i];
				brr[d] = i;
			}
		}
		for(int i =1; i<n; i++)
		{
			System.out.print(brr[i]);
		}
	}

}
