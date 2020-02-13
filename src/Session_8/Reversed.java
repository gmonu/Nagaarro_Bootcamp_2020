package Session_8;

import java.util.Scanner;

public class Reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr;
		arr = new int[n];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]=in.nextInt();
		}
		reverse(arr);
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		
		

	}

	public static void reverse(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			swap(arr, left, right);
			left++;
			right--;
		}

	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
