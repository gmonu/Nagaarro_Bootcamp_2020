package Session_8;

import java.util.Scanner;

public class Insertion_Sort {

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

		insertionSort(arr);
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j, j - 1);
			}
		}
	}

}
