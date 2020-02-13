package Session_8;

import java.util.Scanner;

public class First_in8 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr;
		arr = new int[10];
		for(int i = 0; i< arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(max(arr));
		sc.close();
	}
	static int max(int[] n)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n.length; i++)
		{
			if(n[i]>max);
			max = n[i];
		}
		return max;
	}

}
