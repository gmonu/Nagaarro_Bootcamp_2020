package Session_14;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
 		for(int i =0; i< a.length; i++)
		{
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
 		Arrays.sort(a);
 		
 			if(Arrays.equals(a, b))
 			{
 				System.out.println("true");
 			}
 			else {
 				System.out.println("false");

 			}
	}

}
