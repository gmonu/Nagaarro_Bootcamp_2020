package Session_8;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Maximum_value {
		public static void main(String args[])
		{
				Scanner sc = new Scanner(System.in);
				int N = sc.nextInt();
				int[] arr;
				arr = new int[N];
					for(int i = 0; i< arr.length; i++)
						{
							arr[i] = sc.nextInt();
						}
	
					Arrays.sort(arr);
	int n = arr.length;
	System.out.print(arr[n-1]);
sc.close();
 }
}
