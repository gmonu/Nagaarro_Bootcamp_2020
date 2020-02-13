package Session_8;

import java.util.Scanner;

public class First_in8 {
	public static void main(String args[])
	{
		
		int[] arr = {50,60,70,10,90};
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]); 
		}
		System.out.println(max(arr));
		
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
