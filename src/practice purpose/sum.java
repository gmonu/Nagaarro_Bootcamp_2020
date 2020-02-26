
import java.util.*;
class sorted { 

	static int arraySortedOrNot(int arr[], int n) 
	{ 
		if (n == 1 || n == 0) 
			return 1; 

		if (arr[n - 1] < arr[n - 2]) 
			return 0; 

		return arraySortedOrNot(arr, n - 1); 
	} 

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int arr[] = new int[k];
		for(int i =0; i<k; i++)
		{
			arr[i]= sc.nextInt();
		} 
		int n = arr.length; 
		if (arraySortedOrNot(arr, n) != 0) 
			System.out.println("true"); 
		else
			System.out.println("false"); 
	} 
} 
